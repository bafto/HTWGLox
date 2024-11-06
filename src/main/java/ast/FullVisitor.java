package ast;

public abstract class FullVisitor<T>
    implements ExpressionVisitor<T>, StatementVisitor<T>, DeclarationVisitor<T> {}
