package lesson18.demos._01_intro._02._021;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
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
