package lesson19.demos._5_collections._04._01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Робота зі списком, відсортованим
// у порядку спадання.
public class Main02 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(7);
        list.add(4);
        list.add(2);

        // Останній параметр вказує метод
        // компаратора, що використовується для сортування
        int index = Collections.binarySearch(list, 4,
                Collections.reverseOrder());

        System.out.println("Index is " + index);
    }
}
