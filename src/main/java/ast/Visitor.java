package ast;

public interface Visitor<T> {
  private T visit(Node n) {
    if (n != null) {
      return n.accept(this);
    }
    return null;
  }

  public default T visitFuncDecl(FuncDecl stmt) {
    visit(stmt.body);
    return null;
  }

  public default T visitVarDecl(VarDecl stmt) {
    visit(stmt.initializer);
    return null;
  }

  public default T visitIdentifier(Identifier expr) {
    return null;
  }

  public default T visitUnaryExpr(UnaryExpr expr) {
    visit(expr.rhs);
    return null;
  }

  public default T visitBinaryExpr(BinaryExpr expr) {
    visit(expr.rhs);
    visit(expr.lhs);
    return null;
  }

  public default T visitStringLiteral(StringLiteral expr) {
    return null;
  }

  public default T visitNumberLiteral(NumberLiteral expr) {
    return null;
  }

  public default T visitBoolLiteral(BoolLiteral expr) {
    return null;
  }

  public default T visitCallExpr(CallExpr expr) {
    for (var n : expr.args) {
      visit(n);
    }
    return null;
  }

  public default T visitAssignStmt(AssignStmt stmt) {
    visit(stmt.rhs);
    return null;
  }

  public default T visitBlockStmt(BlockStmt stmt) {
    for (var s : stmt.statements) {
      visit(s);
    }
    return null;
  }

  public default T visitExprStmt(ExprStmt stmt) {
    visit(stmt.expr);
    return null;
  }

  public default T visitForStmt(ForStmt stmt) {
    visit(stmt.decl);
    visit(stmt.condition);
    visit(stmt.body);
    visit(stmt.end_stmt);
    return null;
  }

  public default T visitIfStmt(IfStmt stmt) {
    visit(stmt.condition);
    visit(stmt.body);
    visit(stmt.else_body);
    return null;
  }

  public default T visitPrintStmt(PrintStmt stmt) {
    visit(stmt.rhs);
    return null;
  }

  public default T visitReturnStmt(ReturnStmt stmt) {
    visit(stmt.rhs);
    return null;
  }

  public default T visitDeclStmt(DeclStmt stmt) {
    visit(stmt.decl);
    return null;
  }
}
