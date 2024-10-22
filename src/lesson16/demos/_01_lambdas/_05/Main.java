package lesson16.demos._01_lambdas._05;

import java.util.HashMap;
import java.util.Map;

// Лямбда з Map та циклом
public class Main {

    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();
        products.put("apple", 1.99);
        products.put("orange", 3.97);
        products.put("banana", 1.95);
        products.put("cherry", 2.99);
        products.put("pear", 2.95);

        // Без лямбди
//        for (Map.Entry<String, Double> entry : products.entrySet()) {
//            System.out.println("Product: " + entry.getKey() +
//                    ", price: " + entry.getValue());
//        }

        // З лямбдою
        products.forEach(
                (name, price) ->
                        System.out.println("Product: " + name +
                        ", price USD " + price)
        );

    }
}
