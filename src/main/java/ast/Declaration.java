package ast;

public interface Declaration extends Node {
  public <T> T accept(DeclarationVisitor<T> visitor);
}
