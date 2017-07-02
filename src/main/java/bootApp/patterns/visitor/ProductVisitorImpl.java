package bootApp.patterns.visitor;

public class ProductVisitorImpl implements ProductVisitor {

    private double totalPrice;

    @Override
    public void visit(Chips chips) {
        totalPrice += chips.getPrice();
    }

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(Potato potato) {
        totalPrice += potato.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
