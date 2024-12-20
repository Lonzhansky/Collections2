package lesson19.demos._5_collections._04._01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Робота зі списком, відсортованим
// в порядку збільшення.
public class Main01 {

    static int index;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(12);

        // Значення 7 є в індексі 2.
        index = Collections.binarySearch(list, 7);
        System.out.println("Index is " + index);

        // Значення 15 немає у списку.
        // 15 було вставлено у позицію 5.
        // Таким чином, функція binarySearch()
        // повертає (-5-1), що дорівнює -6.
        index = Collections.binarySearch(list, 15);
        System.out.println("Index is " + index);

    }
}
