package ast;

public class BoolLiteral implements Expression {
  public final boolean value;

  public BoolLiteral(final boolean val) {
    this.value = val;
  }

  public String toString() {
    return String.format("BoolList(val = %b)", value);
  }
}
