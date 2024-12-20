package lesson18.demos._01_intro._03._032;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Product product = new Product();
        store.setProduct(product);
        product.setName("Orange");
        // Створюємо об’єкт Optional<Product> через метод ofNullable.
        // Цей метод повертає Optional, який описує надане значення
        // store.getProduct(), якщо воно не null.
        // В іншому випадку він поверне порожній Optional.
        Optional<Product> optional =
                Optional.ofNullable(store.getProduct());

        // Метод isPresent повертає true, якщо значення присутнє,
        // інакше повертає false, коли значення null або відсутнє.
        if (optional.isPresent()) {
            String name = product.getName();
            System.out.println("Product: " + name);
        } else {
            System.out.println("No data :(");
        }
    }

}
