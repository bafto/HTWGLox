package ast;

import java.util.List;

public class CallExpr implements Expression {
  public final String callee;
  public final List<Expression> args;

  public CallExpr(final String callee, final List<Expression> args) {
    this.callee = callee;
    this.args = args;
  }

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visitCallExpr(this);
  }

  public String toString() {
    StringBuilder builder = new StringBuilder(String.format("CallExpr(callee = %s, ", callee));
    for (Expression e : args) {
      builder.append(e.toString());
      builder.append(';');
    }
    builder.append(")");
    return builder.toString();
  }
}
