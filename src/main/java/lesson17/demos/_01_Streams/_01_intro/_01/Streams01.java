package lesson17.demos._01_Streams._01_intro._01;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

// Створення Stream із масиву
public class Streams01 {

    public static void main(String[] args) {

        String[] names = {"Arnold", "Megan", "Tom", "Steve", "John"};

        System.out.println(Arrays.toString(names));

        // Створення потоку
        Stream<String> stream = Arrays.stream(names);

        AtomicInteger cnt = new AtomicInteger(0);

        stream.forEach(name ->
                System.out.println(cnt.incrementAndGet()
                        + ") " + name)
        );

        System.out.println(Arrays.toString(names));

    }
}
