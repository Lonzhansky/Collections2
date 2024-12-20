package lesson17.demos._01_Streams._02_builder;

import java.util.stream.Stream;

public class StreamsBuilder01 {

    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();

        // Додання елементів в Stream
        Stream<String> stream = builder.add("Orange").build();

        stream.forEach(System.out::println);
    }
}
