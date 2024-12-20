package lesson17.demos._01_Streams._07_find._01;

import java.util.Arrays;
import java.util.List;

// Використання findFirst() у поєднанні
// з методом filter(), щоб одержати
// першого елемента в Stream, який
// більше певного значення.
public class StreamsFindFirst02 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7, 9, 5, 7, 4, 9);

        list.stream()
                .filter(n -> n > 7)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
