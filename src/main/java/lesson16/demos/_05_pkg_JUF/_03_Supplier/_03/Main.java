package lesson16.demos._05_pkg_JUF._03_Supplier._03;

import java.util.function.Supplier;

// Використання Supplier як постачальника
// об'єкта класу.
// Можемо створювати об'єкти класу, використовуючи
// інтерфейс Supplier.
public class Main {

    static String name;
    static double price;

    public static void main(String[] args) {

        name = "Orange";
        price = 2.99;

        // Виклик дефолтного конструктора
        Product product = getProduct(Product::new);
        product.setName(name);
        product.setPrice(price);
        System.out.println("1) Product " + product.getName() +
                ", price is USD " + product.getPrice());

        // Виклик параметризованого конструктора
        product = getProduct(() -> new Product(name,  price));
        System.out.println("2) Product " + product.getName() +
                ", price is USD " + product.getPrice());
    }

    // Створюємо об'єкт класу через інтерфейс Supplier
    public static Product getProduct(Supplier<Product> supplier) {
        return supplier.get();
    }
}
