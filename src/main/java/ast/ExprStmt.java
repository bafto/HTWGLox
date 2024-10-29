package ast;

public class ExprStmt implements Statement {
  public final Expression expr;

  public ExprStmt(final Expression expr) {
    this.expr = expr;
  }

  public String toString() {
    return String.format("ExprStmt(rhs = %s)", expr);
  }
}
