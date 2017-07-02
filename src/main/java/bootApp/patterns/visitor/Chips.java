package bootApp.patterns.visitor;

public class Chips extends Product {

    @Override
    public void accept(ProductVisitor productVisitor) {
        productVisitor.visit(this);
    }
}
