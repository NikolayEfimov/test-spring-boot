package bootApp.patterns.visitor;

public class Book extends Product {

    @Override
    public void accept(ProductVisitor productVisitor) {
        productVisitor.visit(this);
    }
}
