package ast;

public class PrintStmt implements Statement {
  public final Expression rhs;

  public PrintStmt(final Expression rhs) {
    this.rhs = rhs;
  }

  public <T> T accept(StatementVisitor<T> visitor) {
    return visitor.visitPrintStmt(this);
  }

  public String toString() {
    return String.format("PrintStmt(rhs = %s)", rhs);
  }
}
