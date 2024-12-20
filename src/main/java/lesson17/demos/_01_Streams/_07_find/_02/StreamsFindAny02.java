package lesson17.demos._01_Streams._07_find._02;

import java.util.Arrays;
import java.util.List;

// Використання findAny() у поєднанні
// з методом filter(), щоб одержати
// першого елемента в Stream, який
// більше певного значення.
public class StreamsFindAny02 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 9, 5, 7, 4, 9);

        list.stream()
                .filter(n -> n > 5)
                .findAny()
                .ifPresent(System.out::println);
    }
}
