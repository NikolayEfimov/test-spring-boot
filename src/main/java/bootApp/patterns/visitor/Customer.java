package bootApp.patterns.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

    public static void main(String args[]) {
        Product chips1 = new Chips();
        chips1.setPrice(25);

        Product chips2 = new Chips();
        chips2.setPrice(35);

        Product potato = new Potato();
        potato.setPrice(10);

        Product book = new Book();
        book.setPrice(100);

        List<Product> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(chips1, chips2, potato, book));

        ProductVisitorImpl productVisitor = new ProductVisitorImpl();
        for (Product product : productList) {
            product.accept(productVisitor);
        }

        double totalPrice = productVisitor.getTotalPrice();
        System.out.println("totalPrice = " + totalPrice);


    }
}
