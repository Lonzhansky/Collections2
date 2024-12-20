package lesson18.demos._01_intro._01._012;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();

        // Товар поставлено у магазин
        Product product = new Product();
        product.setName("Orange");
        store.setProduct(product);

        // НЕ має викликати Exception
        String res = store.getProduct().getName();

        System.out.println("Product: " + res);
    }
}
