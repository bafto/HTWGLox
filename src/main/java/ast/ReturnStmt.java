package ast;

public class ReturnStmt implements Statement {
  public final Expression rhs;

  public ReturnStmt(final Expression rhs) {
    this.rhs = rhs;
  }

  public String toString() {
    return String.format("ReturnStmt(rhs = %s)", rhs);
  }
}
