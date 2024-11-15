package lesson21.ann._01_standard_annots._04_SafeVarargs;

import java.util.List;

public class Example {
    @SafeVarargs
    public static <T> void printAll(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        printAll("Apple", "Banana", "Cherry");
        printAll(1, 2, 3, 4, 5);
    }
}