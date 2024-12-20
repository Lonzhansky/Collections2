package lesson17.demos._01_Streams._03_filter._01;

import java.util.stream.Stream;

public class StreamsFilter07 {

    public static void main(String[] args) {

        Stream<String> stream =
                Stream.of("Orange", "bRead",
                        "MILK", "KiwiApple");

        // Отримуємо потік, що складається з елементів,
        // що мають символ верхнього регістру
        // за індексом 1
        stream.filter(str ->
                        Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);
    }
}
