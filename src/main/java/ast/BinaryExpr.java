package ast;

public class BinaryExpr implements Expression {
  public final Expression lhs;
  public final BinaryOp op;
  public final Expression rhs;

  public BinaryExpr(final Expression lhs, final BinaryOp op, final Expression rhs) {
    this.lhs = lhs;
    this.op = op;
    this.rhs = rhs;
  }

  public String toString() {
    return String.format(
        "BinaryExpr(lhs = %s, op = %s, rhs = %s)", lhs.toString(), op.toString(), rhs.toString());
  }

  enum BinaryOp {
    PLUS,
    MINUS,
    MULT,
    DIV,
    MOD,
    EQUAL,
    UNEQUAL,
    LESS,
    GREATER,
    LESS_EQUAL,
    GREATER_EQUAL,
    AND,
    OR,
  }
}
