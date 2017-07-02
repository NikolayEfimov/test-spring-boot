package bootApp.patterns.visitor;

public interface ProductVisitor {
    void visit(Chips chips);

    void visit(Book book);

    void visit(Potato potato);

}