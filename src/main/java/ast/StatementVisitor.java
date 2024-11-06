package ast;

public interface StatementVisitor<T> extends Visitor<T> {
  public default T visitAssignStmt(AssignStmt stmt) {
    return null;
  }

  public default T visitBlockStmt(BlockStmt stmt) {
    return null;
  }

  public default T visitExprStmt(ExprStmt stmt) {
    return null;
  }

  public default T visitForStmt(ForStmt stmt) {
    return null;
  }

  public default T visitIfStmt(IfStmt stmt) {
    return null;
  }

  public default T visitPrintStmt(PrintStmt stmt) {
    return null;
  }

  public default T visitReturnStmt(ReturnStmt stmt) {
    return null;
  }

  public default T visitDeclStmt(DeclStmt stmt) {
    return null;
  }
}
