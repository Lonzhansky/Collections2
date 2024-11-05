package lesson18.demos._01_intro._01._011;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();

        // Має викликати Exception
        String res = store.getProduct().getName();

        System.out.println("Product: " + res);
    }
}
