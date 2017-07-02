package bootApp.patterns.visitor;

public abstract class Product {

    private double price;

    abstract void accept(ProductVisitor productVisitor);

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
