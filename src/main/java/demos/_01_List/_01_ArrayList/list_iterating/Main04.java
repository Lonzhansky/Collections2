package demos._01_List._01_ArrayList.list_iterating;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Формування списку через користувацьке введення
public class Main04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getOutput(getData(getItemsNumber()));
    }

    private static int getItemsNumber() {
        System.out.print("Input number of items: ");
        return sc.nextInt();
    }

    private static List<String> getData(int num) {
        System.out.println("\nInput each item name...");
        List<String> list = new ArrayList<>(num);
        int count = 0;
        for (int i = 0; i < num; i++) {
            count++;
            System.out.print("Input item name #" + count + " : ");
            list.add(sc.next());
        }
        return list;
    }

    private static void getOutput(List<String> list) {
        System.out.println("\nITEMS LIST:");
        int count = 0;
        for (String item : list) {
            count++;
            System.out.println(count + ") " + item);
        }
    }
}
