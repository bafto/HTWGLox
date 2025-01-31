package ast;

public class AssignStmt implements Statement {
  public final Identifier lhs;
  public final Expression rhs;

  public AssignStmt(final Identifier lhs, final Expression rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
  }

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visitAssignStmt(this);
  }

  public String toString() {
    return String.format("AssignStmt(name = %s, Expr = %s)", lhs.toString(), rhs.toString());
  }
}
