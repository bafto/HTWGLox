package ast;

import java.util.List;

public class FuncDecl implements Declaration {
  public final Identifier name;
  public final List<VarDecl> params;
  public final Type returnType;
  public final BlockStmt body;

  public FuncDecl(
      final Identifier name,
      final List<VarDecl> params,
      final Type returnType,
      final BlockStmt body) {
    this.name = name;
    this.params = params;
    this.body = body;
    this.returnType = returnType;
  }

  public <T> T accept(DeclarationVisitor<T> visitor) {
    return visitor.visitFuncDecl(this);
  }

  public String toString() {
    StringBuilder builder = new StringBuilder(String.format("FuncDecl(name = %s, params = ", name));
    for (VarDecl d : params) {
      builder.append(d.toString());
      builder.append(';');
    }
    builder.append(String.format(", returnType = %s, body = %s)", returnType, body));
    return builder.toString();
  }
}
