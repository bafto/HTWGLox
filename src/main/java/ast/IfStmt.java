package ast;

import java.util.Objects;

public class IfStmt implements Statement {
  public final Expression condition;
  public final Statement body;
  public final Statement else_body;

  public IfStmt(final Expression condition, final Statement body, final Statement else_body) {
    this.condition = condition;
    this.body = body;
    this.else_body = else_body;
  }

  public String toString() {
    return String.format(
        "IfStmt(condition = %s, body = %s, else_body = %s)",
        condition, body, Objects.toString(else_body, "null"));
  }
}
