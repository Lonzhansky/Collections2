package lesson17.demos._01_Streams._02_builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsBuilder03 {

    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();

        // Додання елементів в Stream
        Stream<String> stream = builder.add("ORANGE")
                .add("plum")
                .add("Apple")
                .add("KiwiPop")
                .build();

        // Перетворюємо елементи на нижній регістр
        // і зберігаємо їх у списку
        List<String> list = stream.map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
