package ast;

public interface DeclarationVisitor<T> extends Visitor<T> {
  public default T visitFuncDecl(FuncDecl stmt) {
    return null;
  }

  public default T visitVarDecl(VarDecl stmt) {
    return null;
  }
}
