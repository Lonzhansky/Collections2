package lesson17.demos._01_Streams._05_flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamsFlatMap02 {

    public static void main(String[] args) {
        // Створення списку простих чисел
        List<Integer> list1 = Arrays.asList(5, 7, 11, 13);

        // Створення списку непарних чисел
        List<Integer> list2 = Arrays.asList(1, 3, 5);

        // Створення списку парних чисел
        List<Integer> list3 = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> list4 = Arrays.asList(list1, list2, list3);

        // Виведення ПЕРЕД згладжуванням (flattening)
        System.out.println("Before flattening: " + list4);

        // Використання flatMap() для перетворення та згладжування
        List<Integer> list5 = list4.stream()
                .flatMap(Collection::stream)
                .toList();

        // Виведення ПІСЛЯ згладжування (flattening)
        System.out.println("After flattening: " + list5);
    }
}
