package ast;

public class Identifier implements Expression {
  public final String name;

  public Identifier(final String name) {
    this.name = name;
  }

  public String toString() {
    return String.format("Identifier(name = %s)", name);
  }
}
