package ast;

public class ExprStmt implements Statement {
  public final Expression expr;

  public ExprStmt(final Expression expr) {
    this.expr = expr;
  }

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visitExprStmt(this);
  }

  public String toString() {
    return String.format("ExprStmt(rhs = %s)", expr);
  }
}
