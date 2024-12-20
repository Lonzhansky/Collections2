package lesson17.demos._01_Streams._03_filter._01;

import java.util.stream.Stream;

public class StreamsFilter08 {

    public static void main(String[] args) {

        Stream<String> stream =
                Stream.of("Orange", "KiwiBread",
                "BerryOlive", "olive", "bread", "Onion");

        // Отримуємо потік, що складається з
        // елементів, що починаються на "O"
        stream.filter(str -> str.startsWith("O"))
                .forEach(System.out::println);
    }
}
