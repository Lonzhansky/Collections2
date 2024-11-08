package lesson19.demos._5_collections._04._02;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static List<Product> list;
    static Scanner scanner;

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        list = repository.getData();
        DataHandler handler = new DataHandler();
        getOutput(formOutput(handler.sortData(list,
                getDataInput()), list));
    }

    private static double getDataInput() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Enter price (x.xx): ");
        return scanner.nextDouble();
    }

    private static String formOutput(int index, List<Product> list) {
        String output;
        if (index < 0) {
            output = "No data.";
        } else {
            output = "Product: " + list.get(index).getName() +
                    ", price USD " + list.get(index).getPrice();
        }
        return output;
    }

    private static void getOutput(String output) {
        scanner.close();
        System.out.println(output);
    }
}
