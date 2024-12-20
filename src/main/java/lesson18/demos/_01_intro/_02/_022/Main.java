package lesson18.demos._01_intro._02._022;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();

        // Товар поставлено у магазин
        Product product = new Product();
        product.setName("Orange");
        store.setProduct(product);

        String res = getProductInfo(store);
        System.out.println("Product: " + res);
    }

    // Перевірка на null через if
    public static String getProductInfo(Store store) {
        if (store != null) {
            Product product = store.getProduct();
            if (product != null) {
                return product.getName();
            }
        }
        return "No data :(";
    }
}
