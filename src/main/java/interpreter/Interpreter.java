package interpreter;

import ast.*;
import ast.UnaryExpr.UnaryOp;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Interpreter implements Visitor<Object> {
  private Stack<Map<String, Object>> scopes = new Stack<>();

  private void scopeStart() {
    scopes.push(new HashMap<>());
  }

  private void scopeEnd() {
    scopes.pop();
  }

  private void declareVar(VarDecl decl) {
    Object value = null;
    if (decl.initializer != null) {
      value = evaluate(decl.initializer);
    }

    switch (decl.type) {
      case Type.STR:
        if (!(value instanceof String)) {
          throw new RuntimeException("wrong var init type");
        }
      case Type.BOOL:
        if (!(value instanceof Boolean)) {
          throw new RuntimeException("wrong var init type");
        }
      case Type.NUM:
        if (!(value instanceof Double)) {
          throw new RuntimeException("wrong var init type");
        }
    }

    scopes.peek().put(decl.name(), value);
  }

  private void declareFunc(FuncDecl decl) {
    scopes.peek().put(decl.name(), decl);
  }

  private Object getScopeValue(String name) {
    int i = 1;
    var scope = scopes.peek();
    while (!scope.containsKey(name)) {
      if (i >= scopes.size()) {
        scope = null;
        break;
      }
      scope = scopes.get(scopes.size() - ++i);
    }

    if (scope == null) {
      throw new RuntimeException("No value defined for " + name);
    }
    return scope.get(name);
  }

  private FuncDecl getFunc(String name) {
    Object o = getScopeValue(name);
    if (o instanceof FuncDecl f) {
      return f;
    }
    throw new RuntimeException("Only functions can be called");
  }

  public Object evaluate(Expression expr) {
    if (expr == null) {
      throw new RuntimeException("cannot evaluate null expression");
    }
    return expr.accept(this);
  }

  public void execute(Statement stmt) {
    if (stmt != null) {
      stmt.accept(this);
    }
  }

  public Object visitFuncDecl(FuncDecl decl) {
    declareFunc(decl);
    return null;
  }

  public Object visitVarDecl(VarDecl decl) {
    declareVar(decl);
    return null;
  }

  public Object visitIdentifier(Identifier expr) {
    return getScopeValue(expr.name);
  }

  public Object visitUnaryExpr(UnaryExpr expr) {
    Object rhs = evaluate(expr.rhs);
    switch (expr.op) {
      case UnaryOp.MINUS:
        if (rhs instanceof Double d) {
          return -d;
        } else if (rhs instanceof Integer i) {
          return -i;
        }
        throw new RuntimeException("Unary MINUS can only be applied to numbers");
      case UnaryOp.NEGATION:
        if (rhs instanceof Boolean b) {
          return !b;
        }
        throw new RuntimeException("Negation can only be applied to booleans");
    }
    return null;
  }

  public Object visitBinaryExpr(BinaryExpr expr) {
    switch (expr.op) {
      case PLUS:
        {
          Object lhs = evaluate(expr.lhs);
          Object rhs = evaluate(expr.rhs);
          if (lhs instanceof Double n) {
            return n + (Double) rhs;
          }
          return (String) lhs + (String) rhs;
        }
      case MINUS:
        return (Double) evaluate(expr.lhs) - (Double) evaluate(expr.rhs);
      case MULT:
        return (Double) evaluate(expr.lhs) * (Double) evaluate(expr.rhs);
      case DIV:
        return (Double) evaluate(expr.lhs) / (Double) evaluate(expr.rhs);
      case MOD:
        return (Double) evaluate(expr.lhs) % (Double) evaluate(expr.rhs);
      case EQUAL:
        return evaluate(expr.lhs).equals(evaluate(expr.rhs));
      case UNEQUAL:
        return !evaluate(expr.lhs).equals(evaluate(expr.rhs));
      case LESS:
        return (Double) evaluate(expr.lhs) < (Double) evaluate(expr.rhs);
      case GREATER:
        return (Double) evaluate(expr.lhs) > (Double) evaluate(expr.rhs);
      case LESS_EQUAL:
        return (Double) evaluate(expr.lhs) <= (Double) evaluate(expr.rhs);
      case GREATER_EQUAL:
        return (Double) evaluate(expr.lhs) >= (Double) evaluate(expr.rhs);
      case AND:
        {
          Boolean lhs = (Boolean) evaluate(expr.lhs);
          Boolean rhs = (Boolean) evaluate(expr.rhs);
          return lhs && rhs;
        }
      case OR:
        {
          Boolean lhs = (Boolean) evaluate(expr.lhs);
          if (lhs) {
            return true;
          }
          return (Boolean) evaluate(expr.rhs);
        }
    }
    return null;
  }

  public Object visitStringLiteral(StringLiteral expr) {
    return expr.value;
  }

  public Object visitNumberLiteral(NumberLiteral expr) {
    return expr.value;
  }

  public Object visitBoolLiteral(BoolLiteral expr) {
    return expr.value;
  }

  private Object call(String name, Object[] args) {
    FuncDecl d = getFunc(name);
    throw new UnsupportedOperationException("function calls are not yet implemented");
  }

  public Object visitCallExpr(CallExpr expr) {
    Object[] args = new Object[expr.args.size()];
    for (int i = 0; i < args.length; i++) {
      args[i] = evaluate(expr.args.get(i));
    }
    return call(expr.callee, args);
  }

  public Object visitAssignStmt(AssignStmt stmt) {
    Object val = evaluate(stmt.rhs);

    int i = 1;
    var scope = scopes.peek();
    while (!scope.containsKey(stmt.lhs.name)) {
      if (i >= scopes.size()) {
        scope = null;
        break;
      }
      scope = scopes.get(scopes.size() - i++);
    }

    if (scope == null) {
      throw new RuntimeException("No variable with name " + stmt.lhs.name + " present");
    }

    // TODO: typechecking

    scope.put(stmt.lhs.name, val);
    return null;
  }

  public Object visitBlockStmt(BlockStmt stmt) {
    scopeStart();
    for (var s : stmt.statements) {
      execute(s);
    }
    scopeEnd();
    return null;
  }

  public Object visitExprStmt(ExprStmt stmt) {
    return evaluate(stmt.expr);
  }

  public Object visitForStmt(ForStmt stmt) {
    scopeStart();
    if (stmt.decl != null) {
      declareVar(stmt.decl);
    }
    while (evaluate(stmt.condition) instanceof Boolean b && b) {
      scopeStart();
      execute(stmt.body);
      scopeEnd();
      execute(stmt.end_stmt);
    }
    scopeEnd();
    return null;
  }

  public Object visitIfStmt(IfStmt stmt) {
    Object o = evaluate(stmt.condition);
    if (o instanceof Boolean b) {
      execute(b ? stmt.body : stmt.else_body);
      return null;
    }

    throw new RuntimeException("condition must be a boolean");
  }

  public Object visitPrintStmt(PrintStmt stmt) {
    System.out.println(evaluate(stmt.rhs));
    return null;
  }

  public Object visitReturnStmt(ReturnStmt stmt) {
    // visit(stmt.rhs);
    return null;
  }

  private static class FuncDef {
    FuncDecl decl;
    Map<String, Object> scope = new HashMap<>();

    public FuncDef(FuncDecl decl, Stack<Map<String, Object>> scopes) {
      this.decl = decl;
      for (var scope : scopes) {
        for (var entry : scope.entrySet()) {
          this.scope.put(entry.getKey(), entry.getValue());
        }
      }
    }

    public Object call(Interpreter i, Object[] args) {
      return null;
    }
  }
}
