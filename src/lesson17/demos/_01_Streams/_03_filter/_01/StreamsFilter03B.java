package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Stream filter() з декількома умовами.
// Виведення нумерованого списку.
public class StreamsFilter03B {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Michael", "Linda", "John", "Elizabeth", "Paul");

        // Лічильник
        AtomicInteger count = new AtomicInteger(0);

        names.stream()
                .filter(str -> str.length() > 3 && str.length() < 6)
                .toList()
                .forEach(str ->
                        System.out.println(count.incrementAndGet() +
                                ") " + str)
                );
    }
}
