package lesson18.demos._06_filter._02;

public class Main01 {

    public static void main(String[] args) {
        Product product = new Product("Orange", 3.05);
//        Product product = new Product("Orange", 13.05);
        if (checkProduct(product)) System.out.println(product);
        else System.out.println("No data.");
    }

    // Потрібно написати такий код, щоб виконати перевірку
    // цінового діапазону, але існують інші умови, щоб уникнути
    // NullPointerException.
    public static boolean checkProduct(Product product) {
        return product != null && product.getPrice() != null
                && product.getPrice() > 2.99
                && product.getPrice() <= 6.95;
    }
}
