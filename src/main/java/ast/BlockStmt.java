package ast;

import java.util.List;

public class BlockStmt implements Statement {
  public final List<Statement> statements;

  public BlockStmt(final List<Statement> statements) {
    this.statements = statements;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder("BlockStmt(");
    for (Statement s : statements) {
      builder.append(s.toString());
      builder.append(';');
    }
    builder.append(")");
    return builder.toString();
  }
}
