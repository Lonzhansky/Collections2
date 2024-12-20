package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;

public class StreamsFilter06 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 6, 11, 20);

        // Фільтруємо елементи
        // кратні певному значенню
        list.stream()
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);
    }
}
