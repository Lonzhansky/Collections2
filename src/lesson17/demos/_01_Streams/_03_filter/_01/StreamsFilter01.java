package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamsFilter01 {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Michael", "Linda", "John", "Elizabeth", "Paul");

        // Створення потоку всіх імен
        Stream<String> allNames = names.stream();

        // Створення іншого потоку шляхом
        // фільтрації довгих імен через filter()
        Stream<String> longNames =
                allNames.filter(str -> str.length() > 5);

        // Виведення довгих імен через
        // термінальний оператор forEach()
        AtomicInteger count = new AtomicInteger(1);
        longNames.forEach(name ->
                System.out.println(count.getAndIncrement() +
                        ") " + name));

    }
}
