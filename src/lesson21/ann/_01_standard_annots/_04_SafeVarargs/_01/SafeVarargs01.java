package lesson21.ann._01_standard_annots._04_SafeVarargs._01;

import java.util.Arrays;
import java.util.List;

// НЕ використовуємо @SafeVarargs
public class SafeVarargs01 {

    public static void main(String[] args) {

        String str1 = "Milk";
        String str2 = "Banana";
        String str3 = "Orange";

        // NO WARNING
        displayStrings(str1, str2, str3);
        System.out.println("----------------");
        displayStringVarargs(str1, str2, str3);
        System.out.println("----------------");

        List<String> productList = Arrays.asList("Milk", "Banana", "Orange");
        // WARNING: Unchecked generics array creation for varargs parameter
        displayList(productList);
        System.out.println("----------------");

        List<String> dayList = Arrays.asList("Mon", "Tue", "Wed");
        // WARNING: Unchecked generics array creation for varargs parameter
        displayList(productList, dayList);
    }

    private static void displayStrings(String str1, String str2, String str3) {
        System.out.println("1) " + str1 + " " + str2 + " " + str3);
    }

    private static void displayStringVarargs(String... strs) {
        System.out.println("2) Data:");
        for (String str : strs) {
            System.out.println(str);
        }
    }

    // WARNING: Possible heap pollution from parameterized vararg type
    // Тут List... lists задає аргумент змінної довжини типу List.
    // Це означає, що метод displayList() може мати нуль або більше аргументів.
    private static void displayList(List<String>... lists) {
        System.out.println("3) Data:");
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}
