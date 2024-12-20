package lesson16.demos._02_methods_ref._04;

import java.util.Arrays;

// Посилання методу на метод екземпляра
// певного типу
public class Main {

    public static void main(String[] args) {
        getDataSorted(getData());
    }

    private static String[] getData() {
        return new String[]{"rice", "oranGe", "Apple", "banana"};
    }

    private static void getDataSorted(String[] products) {
        int count = 0;
        // Посилання методу на метод екземпляру String
        Arrays.sort(products, String::compareToIgnoreCase);

        for (String product : products) {
            count++;
            System.out.println(count + ") " + product);
        }
    }
}
