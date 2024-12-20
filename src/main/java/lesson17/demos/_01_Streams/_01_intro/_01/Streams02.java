package lesson17.demos._01_Streams._01_intro._01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

// Створення Stream із колекції
public class Streams02 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arnold");
        names.add("Megan");
        names.add("Tom");
        names.add("Steve");
        names.add("John");

        // Створення потоку
        Stream<String> stream = names.stream();

        AtomicInteger cnt = new AtomicInteger(0);

        stream.forEach(name ->
                System.out.println(cnt.incrementAndGet()
                        + ") " + name)
        );

    }
}
