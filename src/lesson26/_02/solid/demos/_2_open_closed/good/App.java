package lesson26._02.solid.demos._2_open_closed.good;

import java.util.ArrayList;
import java.util.List;

// Формування замовлення
public class App {

    static Product product;

	static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        products = getProducts();

        double orderSum = calculateTotalOrder(products);

        for (Product item : products) {
            System.out.println(item.getName() + " " + item.getType()
                    + " " + item.getPrice());
        }

        System.out.printf("----------------%n" +
                "TOTAL, USD: %.2f", orderSum);

    }

    public static List<Product> getProducts() {

// Погано
//        Product product1 = new Food();
//        product1.setName("Orange");
//        product1.setType("food");
//        product1.setPrice(2.95);
//        products.add(product1);
//
//        Product product2 = new Food();
//        product2.setName("Milk");
//        product2.setType("food");
//        product2.setPrice(7.95);
//        products.add(product2);
//
//        Product product3 = new Garment();
//        product3.setName("T-shirt");
//        product3.setType("garment");
//        product3.setPrice(12.99);
//        products.add(product3);
//
//        Product product4 = new Electronics();
//        product4.setName("Smartphone");
//        product4.setType("electronics");
//        product4.setPrice(230.97);
//        products.add(product4);

        product = new Food();
        product.setName("Orange");
        product.setType("food");
        product.setPrice(2.95);
        products.add(product);

        product = new Food();
        product.setName("Milk");
        product.setType("food");
        product.setPrice(7.95);
        products.add(product);

        product = new Garment();
        product.setName("T-shirt");
        product.setType("garment");
        product.setPrice(12.99);
        products.add(product);

        product = new Electronics();
        product.setName("Smartphone");
        product.setType("electronics");
        product.setPrice(230.97);
        products.add(product);

        return products;
    }

    public static double calculateTotalOrder(List<Product> products) {
        double orderTotal = 0;
        for (Product product : products) {
            orderTotal += product.calculatePriceWithTax();
        }
        return orderTotal;
    }
}
