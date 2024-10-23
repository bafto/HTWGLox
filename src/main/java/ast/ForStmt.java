package ast;

import java.util.Objects;

public class ForStmt implements Statement {
  public final VarDecl decl;
  public final Expression condition;
  public final AssignStmt end_stmt;
  public final BlockStmt body;

  public ForStmt(
      final VarDecl decl,
      final Expression condition,
      final AssignStmt end_stmt,
      final BlockStmt body) {
    this.decl = decl;
    this.condition = condition;
    this.end_stmt = end_stmt;
    this.body = body;
  }

  public String toString() {
    return String.format(
        "ForStmt(decl = %s, condition = %s, end_stmt = %s, body = %s)",
        Objects.toString(decl, "null"),
        Objects.toString(condition, "null"),
        Objects.toString(end_stmt, "null"),
        Objects.toString(body, "null"));
  }
}
