package bootApp.patterns.visitor;

public class Potato extends Product {
    @Override
    public void accept(ProductVisitor productVisitor) {
        productVisitor.visit(this);
    }
}
