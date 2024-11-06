package ast;

public class BoolLiteral implements Expression {
  public final boolean value;

  public BoolLiteral(final boolean val) {
    this.value = val;
  }

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visitBoolLiteral(this);
  }

  public String toString() {
    return String.format("BoolList(val = %b)", value);
  }
}
