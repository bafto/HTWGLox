package ast;

import ast.BinaryExpr.BinaryOp;
import ast.UnaryExpr.UnaryOp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.HTWGLoxParser;
import parser.HTWGLoxParser.AssignContext;
import parser.HTWGLoxParser.Block_stmtContext;
import parser.HTWGLoxParser.Bool_and_exprContext;
import parser.HTWGLoxParser.Bool_or_exprContext;
import parser.HTWGLoxParser.Call_exprContext;
import parser.HTWGLoxParser.Comparison_exprContext;
import parser.HTWGLoxParser.Equality_exprContext;
import parser.HTWGLoxParser.Expression_stmtContext;
import parser.HTWGLoxParser.Factor_exprContext;
import parser.HTWGLoxParser.For_stmtContext;
import parser.HTWGLoxParser.Func_declContext;
import parser.HTWGLoxParser.If_stmtContext;
import parser.HTWGLoxParser.LiteralContext;
import parser.HTWGLoxParser.Negation_exprContext;
import parser.HTWGLoxParser.Primary_exprContext;
import parser.HTWGLoxParser.Print_stmtContext;
import parser.HTWGLoxParser.Return_stmtContext;
import parser.HTWGLoxParser.Term_exprContext;
import parser.HTWGLoxParser.TypeContext;
import parser.HTWGLoxParser.Var_declContext;
import parser.HTWGLoxParserBaseListener;

public class Program {
  public final List<Statement> statements;

  public String toString() {
    StringBuilder builder = new StringBuilder("Program(nodes = ");
    for (Statement n : statements) {
      builder.append(n.toString());
      builder.append(';');
    }
    builder.append(")");
    return builder.toString();
  }

  public Program(final List<Statement> statements) {
    this.statements = statements;
  }

  public static class Builder extends HTWGLoxParserBaseListener {
    private Stack<Statement> statements;
    private Stack<Expression> expressions;

    public Program build(ParseTree tree) {
      statements = new Stack<>();
      expressions = new Stack<>();
      new ParseTreeWalker().walk(this, tree);
      return new Program(new ArrayList<Statement>(statements));
    }

    private Type getTypeFromContext(TypeContext ctx) {
      if (ctx.NUM() != null) {
        return Type.NUM;
      }
      if (ctx.STR() != null) {
        return Type.STR;
      }
      if (ctx.BOOL() != null) {
        return Type.BOOL;
      }
      return null;
    }

    @Override
    public void exitFunc_decl(Func_declContext ctx) {
      BlockStmt body = (BlockStmt) statements.pop();
      List<VarDecl> params = new LinkedList<>();

      for (int i = 0; i < ctx.param_list().typed_name().size(); i++) {
        Identifier name = new Identifier(ctx.param_list().typed_name(i).IDENTIFIER().getText());
        Type type = getTypeFromContext(ctx.param_list().typed_name(i).type());
        params.add(new VarDecl(name, type, null));
      }

      Identifier name = new Identifier(ctx.IDENTIFIER().getText());
      Type returnType = null;
      if (ctx.type() != null) {
        returnType = getTypeFromContext(ctx.type());
      }

      statements.add(new DeclStmt(new FuncDecl(name, params, returnType, body)));
    }

    @Override
    public void exitVar_decl(Var_declContext ctx) {
      Expression initializer = expressions.pop();
      Type type = getTypeFromContext(ctx.typed_name().type());
      Identifier name = new Identifier(ctx.typed_name().IDENTIFIER().getText());

      statements.add(new DeclStmt(new VarDecl(name, type, initializer)));
    }

    @Override
    public void exitPrint_stmt(Print_stmtContext ctx) {
      statements.add(new PrintStmt((Expression) expressions.pop()));
    }

    @Override
    public void exitIf_stmt(If_stmtContext ctx) {
      Statement else_body = null;
      if (ctx.statement(1) != null) {
        else_body = statements.pop();
      }
      Statement body = statements.pop();
      Expression condition = expressions.pop();
      statements.add(new IfStmt(condition, body, else_body));
    }

    @Override
    public void exitFor_stmt(For_stmtContext ctx) {
      BlockStmt body = (BlockStmt) statements.pop();
      AssignStmt assign = null;
      if (ctx.assign() != null) {
        assign = (AssignStmt) statements.pop();
      }
      Expression condition = expressions.pop();
      VarDecl decl = null;
      if (ctx.var_decl() != null) {
        decl = (VarDecl) ((DeclStmt) statements.pop()).decl;
      }

      statements.add(new ForStmt(decl, condition, assign, body));
    }

    @Override
    public void exitAssign(AssignContext ctx) {
      Expression rhs = expressions.pop();
      Identifier lhs = new Identifier(ctx.IDENTIFIER().getText());
      statements.add(new AssignStmt(lhs, rhs));
    }

    @Override
    public void exitReturn_stmt(Return_stmtContext ctx) {
      if (ctx.expression() != null) {
        statements.add(new ReturnStmt(expressions.pop()));
      }
    }

    @Override
    public void exitExpression_stmt(Expression_stmtContext ctx) {
      if (ctx.expression() != null) {
        statements.add(new ExprStmt(expressions.pop()));
      }
    }

    @Override
    public void exitBlock_stmt(Block_stmtContext ctx) {
      List<Statement> stmts = new LinkedList<>();
      for (int i = 0; i < ctx.getChildCount(); i++) {
        if (ctx.getChild(i) instanceof HTWGLoxParser.StatementContext) {
          stmts.addFirst(statements.pop());
        }
      }
      statements.add(new BlockStmt(stmts));
    }

    @Override
    public void exitBool_or_expr(Bool_or_exprContext ctx) {
      if (ctx.BOOL_OR() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.OR, rhs));
      }
    }

    @Override
    public void exitBool_and_expr(Bool_and_exprContext ctx) {
      if (ctx.BOOL_AND() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.AND, rhs));
      }
    }

    @Override
    public void exitEquality_expr(Equality_exprContext ctx) {
      if (ctx.EQUAL() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.EQUAL, rhs));
      } else if (ctx.UNEQUAL() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.UNEQUAL, rhs));
      }
    }

    @Override
    public void exitComparison_expr(Comparison_exprContext ctx) {
      if (ctx.LESS_EQUAL() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.LESS_EQUAL, rhs));
      } else if (ctx.GREATER_EQUAL() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.GREATER_EQUAL, rhs));
      } else if (ctx.LESS() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.LESS, rhs));
      } else if (ctx.GREATER() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.GREATER, rhs));
      }
    }

    @Override
    public void exitTerm_expr(Term_exprContext ctx) {
      if (ctx.PLUS() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.PLUS, rhs));
      } else if (ctx.MINUS() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.MINUS, rhs));
      }
    }

    @Override
    public void exitFactor_expr(Factor_exprContext ctx) {
      if (ctx.STAR() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.MULT, rhs));
      } else if (ctx.SLASH() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.DIV, rhs));
      } else if (ctx.PERCENT() != null) {
        Expression rhs = expressions.pop();
        Expression lhs = expressions.pop();
        expressions.add(new BinaryExpr(lhs, BinaryOp.MOD, rhs));
      }
    }

    @Override
    public void exitNegation_expr(Negation_exprContext ctx) {
      if (ctx.EXCLAMATION_MARK() != null) {
        expressions.add(new UnaryExpr(expressions.pop(), UnaryOp.NEGATION));
      } else if (ctx.MINUS() != null) {
        expressions.add(new UnaryExpr(expressions.pop(), UnaryOp.MINUS));
      }
    }

    @Override
    public void exitCall_expr(Call_exprContext ctx) {
      if (ctx.primary_expr() == null) {
        List<Expression> args = new LinkedList<>();
        for (int i = 0; i < ctx.arg_list().getChildCount(); i++) {
          if (ctx.getChild(i) instanceof HTWGLoxParser.ExpressionContext) {
            args.addFirst(expressions.pop());
          }
        }
        expressions.add(new CallExpr(ctx.IDENTIFIER().getText(), args));
      }
    }

    @Override
    public void exitPrimary_expr(Primary_exprContext ctx) {
      if (ctx.IDENTIFIER() != null) {
        expressions.add(new Identifier(ctx.IDENTIFIER().getText()));
      }
    }

    @Override
    public void exitLiteral(LiteralContext ctx) {
      if (ctx.NUMBER_LITERAL() != null) {
        expressions.add(new NumberLiteral(Double.parseDouble(ctx.NUMBER_LITERAL().getText())));
      } else if (ctx.STRING_LITERAL() != null) {
        String lit = ctx.STRING_LITERAL().getText();
        expressions.add(new StringLiteral(lit.substring(1, lit.length() - 1)));
      } else if (ctx.TRUE() != null || ctx.FALSE() != null) {
        expressions.add(new BoolLiteral(ctx.TRUE() != null));
      }
    }
  }
}
