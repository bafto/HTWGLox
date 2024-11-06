package ast;

public class Identifier implements Expression {
  public final String name;

  public Identifier(final String name) {
    this.name = name;
  }

  public <T> T accept(ExpressionVisitor<T> visitor) {
    return visitor.visitIdentifier(this);
  }

  public String toString() {
    return String.format("Identifier(name = %s)", name);
  }
}
