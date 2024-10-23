package ast;

import java.util.Objects;

public class VarDecl implements Declaration {
  public final Identifier name;
  public final Type type;
  public final Expression initializer;

  public VarDecl(final Identifier name, final Type type, final Expression initializer) {
    this.name = name;
    this.type = type;
    this.initializer = initializer;
  }

  public String toString() {
    return String.format(
        "VarDecl(name = %s, type = %s, initializer = %s)",
        name, type, Objects.toString(initializer, "null"));
  }
}
