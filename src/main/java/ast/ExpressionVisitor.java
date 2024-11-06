package ast;

public interface ExpressionVisitor<T> {
  public default T visitIdentifier(Identifier expr) {
    return null;
  }

  public default T visitUnaryExpr(UnaryExpr expr) {
    return null;
  }

  public default T visitBinaryExpr(BinaryExpr expr) {
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
    return null;
  }
}
