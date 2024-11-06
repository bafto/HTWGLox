package ast;

public interface Statement extends Node {
  public <T> T accept(StatementVisitor<T> visitor);
}
