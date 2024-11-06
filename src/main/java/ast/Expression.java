package ast;

public interface Expression extends Node {
  public <T> T accept(ExpressionVisitor<T> visitor);
}
