package lesson17.demos._01_Streams._01_intro._01;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

// Створення Stream із значень
public class Streams03 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Arnold", "Megan",
                "Tom", "Steve", "John");

        AtomicInteger cnt = new AtomicInteger(0);

        stream.forEach(name ->
                System.out.println(cnt.incrementAndGet() +
                        ") " + name));

    }
}
