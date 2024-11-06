package ast;

public class DeclStmt implements Statement {
  public final Declaration decl;

  public DeclStmt(Declaration decl) {
    this.decl = decl;
  }

  public <T> T accept(StatementVisitor<T> visitor) {
    return visitor.visitDeclStmt(this);
  }

  @Override
  public String toString() {
    return String.format("DeclStmt(%s)", decl.toString());
  }
}
