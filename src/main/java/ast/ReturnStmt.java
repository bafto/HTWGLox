package ast;

public class ReturnStmt implements Statement {
  public final Expression rhs;

  public ReturnStmt(final Expression rhs) {
    this.rhs = rhs;
  }

  public <T> T accept(StatementVisitor<T> visitor) {
    return visitor.visitReturnStmt(this);
  }

  public String toString() {
    return String.format("ReturnStmt(rhs = %s)", rhs);
  }
}
