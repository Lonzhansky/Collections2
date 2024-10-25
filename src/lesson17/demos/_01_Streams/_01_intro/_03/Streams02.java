package lesson17.demos._01_Streams._01_intro._03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Об'єднання двох потоків
public class Streams02 {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "plum", "grape");

        List<String> names = Arrays.asList("Samanta", "John", "Ann");

        // Створення двох потоків із двох списків та об'єднання їх в один
        Stream<String> stream =
                Stream.concat(fruits.stream(), names.stream());

        stream.forEach(str -> System.out.print(str + " "));
    }
}
