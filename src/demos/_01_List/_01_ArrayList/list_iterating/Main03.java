package demos._01_List._01_ArrayList.list_iterating;

import java.util.ArrayList;
import java.util.List;
// https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html
import java.util.ListIterator;

// Застосування ListIterator для перебирання списку.
// Зокрема, ListIterator дозволяє переміщатися по списку
// в будь-якому напрямку.
public class Main03 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("apple");
        list.add("kiwi");
        list.add("mango");

        // Метод listIterator() повертає ітератор списку.
        ListIterator<String> iterator = list.listIterator();

        System.out.println("\nIterating elements in forward direction:");
        while (iterator.hasNext()) {
            System.out.println("index: " + iterator.nextIndex() +
                    ", value: " + iterator.next());
        }

        System.out.println("\nIterating elements in backward direction:");
        while (iterator.hasPrevious()) {
            System.out.println("index: " + iterator.previousIndex() +
                    ", value: " + iterator.previous());
        }
    }
}
