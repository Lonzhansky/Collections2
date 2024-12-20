package lesson18.demos._06_filter._02;

import java.util.Optional;

public class Main02 {

    public static void main(String[] args) {
        Product product = new Product("Orange", 3.05);
//        Product product = new Product("Orange", 13.05);
        if (checkProduct(product))
            System.out.println("1) Data:" + product);
        else System.out.println("No data.");

        double from = 2.99;
        double to = 6.95;
        if (checkProduct(product, from, to))
            System.out.println("2) Data:" + product);
        else System.out.println("No data.");
    }

    public static boolean checkProduct(Product product) {
        return Optional.ofNullable(product)
                .map(Product::getPrice)
                .filter(productPrice -> productPrice > 2.99)
                .filter(productPrice -> productPrice <= 6.95)
                .isPresent();
    }

    public static boolean checkProduct(Product product,
                                       double from, double to) {
        return Optional.ofNullable(product)
                .map(Product::getPrice)
                .filter(productPrice -> productPrice > from)
                .filter(productPrice -> productPrice <= to)
                .isPresent();
    }
}
