package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// Відфільтровуємо null із потоку
public class StreamsFilter10 {

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Orange", "Plum", null, "Banana", null);

        list.stream()
                .filter(Objects::nonNull)
                .toList()
                .forEach(System.out::println);
    }
}
