package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;

// Stream filter() з декількома умовами
public class StreamsFilter03 {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Michael", "Linda", "John", "Elizabeth", "Paul");

        List<String> longNames = names.stream()
                // Декілька умов
                .filter(str -> str.length() > 3 && str.length() < 6)
                .toList();

        longNames.forEach(System.out::println);
    }
}