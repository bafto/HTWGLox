package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Resolver implements Visitor<Void> {
  private Stack<Map<String, Declaration>> scopes = new Stack<>();
  private List<String> errors = new ArrayList<>();

  public Resolver(Program p) {
    resolve(p);
  }

  public List<String> getErrors() {
    return errors;
  }

  private void scopeStart() {
    scopes.push(new HashMap<>());
  }

  private void scopeEnd() {
    scopes.pop();
  }

  private void define(Declaration decl) {
    if (decl == null) {
      return;
    }

    if (scopes.peek().containsKey(decl.name())) {
      errors.add(String.format("Name '%s' already defined", decl.name()));
      return;
    }

    scopes.peek().put(decl.name(), decl);
  }

  private void resolve(final Program p) {
    scopeStart();
    for (Statement stmt : p.statements) {
      resolve(stmt);
    }
    scopeEnd();
  }

  private void resolve(final Statement stmt) {
    if (stmt != null) {
      stmt.accept(this);
    }
  }

  private void resolve(final Expression expr) {
    if (expr != null) {
      expr.accept(this);
    }
  }

  @Override
  public Void visitFuncDecl(FuncDecl f) {
    scopeStart();
    define(f);
    for (VarDecl param : f.params) {
      define(param);
    }
    resolve(f.body);
    scopeEnd();
    return null;
  }

  @Override
  public Void visitVarDecl(VarDecl d) {
    define(d);
    resolve(d.initializer);
    return null;
  }

  @Override
  public Void visitBlockStmt(BlockStmt stmt) {
    scopeStart();
    for (var s : stmt.statements) {
      resolve(s);
    }
    scopeEnd();
    return null;
  }

  @Override
  public Void visitForStmt(ForStmt stmt) {
    scopeStart();
    if (stmt.decl != null) {
      define(stmt.decl);
    }
    resolve(stmt.condition);
    scopeStart();
    resolve(stmt.body);
    scopeEnd();
    resolve(stmt.end_stmt);
    scopeEnd();
    return null;
  }

  @Override
  public Void visitIdentifier(Identifier ident) {
    int i = 1;
    var scope = scopes.peek();
    while (!scope.containsKey(ident.name)) {
      if (i >= scopes.size()) {
        scope = null;
        break;
      }
      scope = scopes.get(scopes.size() - i++);
    }

    if (scope == null) {
      errors.add(String.format("Name '%s' not yet defined", ident.name));
    }
    return null;
  }
}
