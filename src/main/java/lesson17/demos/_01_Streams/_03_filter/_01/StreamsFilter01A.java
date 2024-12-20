package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamsFilter01A {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Michael", "Linda", "John", "Elizabeth", "Paul");

        AtomicInteger count = new AtomicInteger(1);
        // Створення потоку всіх імен
        names.stream()
                // Створення іншого потоку шляхом
                // фільтрації довгих імен через filter()
                .filter(str -> str.length() > 5)
                // Виведення довгих імен через
                // термінальний оператор forEach()
                .forEach(name ->
                        System.out.println(count.getAndIncrement()
                                + ") " + name));

    }
}
