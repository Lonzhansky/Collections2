package lesson17.demos._01_Streams._01_intro._01;

import java.util.stream.Stream;

public class Streams05 {

    public static void main(String[] args) {

        // Створення порожнього Stream
        Stream<String> stream = Stream.empty();

        stream.forEach(System.out::println);
    }
}
