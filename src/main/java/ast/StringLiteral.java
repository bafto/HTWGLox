package ast;

public class StringLiteral implements Expression {
  public final String value;

  public StringLiteral(final String val) {
    this.value = val;
  }

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visitStringLiteral(this);
  }

  public String toString() {
    return String.format("StringLiteral(val = %s)", value);
  }
}
