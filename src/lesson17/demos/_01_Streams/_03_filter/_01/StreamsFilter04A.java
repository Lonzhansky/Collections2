package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;

// Stream filter(), map()
public class StreamsFilter04A {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // Перетворення та виведення
        nums.stream()
                .map(n -> n * n) // Операція над даними
                .toList()
                .forEach(System.out::println);
    }
}
