package lesson17.demos._01_Streams._04_map;

import java.util.Arrays;
import java.util.List;

// Функція Stream map() з операцією числа
// над кожним елементом потоку.
public class StreamsMap01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        list.stream()
                .map(number -> number * 4) // операція над даними
                .forEach(System.out::println);
    }
}
