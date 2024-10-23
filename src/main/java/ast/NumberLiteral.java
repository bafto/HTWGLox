package ast;

public class NumberLiteral implements Expression {
  public final double value;

  public NumberLiteral(final double val) {
    this.value = val;
  }

  public String toString() {
    return String.format("NumberLiteral(val = %g)", value);
  }
}
