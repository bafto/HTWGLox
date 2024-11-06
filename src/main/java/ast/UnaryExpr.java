package ast;

public class UnaryExpr implements Expression {
  public final Expression rhs;
  public final UnaryOp op;

  public UnaryExpr(final Expression rhs, final UnaryOp op) {
    this.rhs = rhs;
    this.op = op;
  }

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visitUnaryExpr(this);
  }

  public String toString() {
    return String.format("UnaryExpr(rhs = %s, op = %s)", rhs, op);
  }

  enum UnaryOp {
    MINUS,
    NEGATION,
  }
}
