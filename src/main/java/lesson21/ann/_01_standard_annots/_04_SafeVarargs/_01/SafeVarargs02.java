package lesson21.ann._01_standard_annots._04_SafeVarargs._01;

import java.util.Arrays;
import java.util.List;

// Використовуємо @SafeVarargs
public class SafeVarargs02 {

    public static void main(String[] args) {
        List<String> productList = Arrays.asList("Milk", "Banana", "Orange");
        displayList(productList);
        System.out.println("----------------");
        List<String> dayList = Arrays.asList("Mon","Tue", "Wed");
        displayList(productList, dayList);
    }

    // Тут List... lists задає аргумент змінної довжини типу List.
    // Це означає, що метод displayList() може мати нуль
    // або більше аргументів.
    @SafeVarargs
    private static void displayList(List<String>... lists) {
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}
