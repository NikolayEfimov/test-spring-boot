package bootApp.patterns.visitor;

public interface Visitable {

    void accept(ProductVisitor visitor );
}
