package lesson17.demos._01_Streams._01_intro._01;

import lesson17.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

// Створення Stream із файла.
// Кожен рядок - окремий елемент в Stream.
public class Streams04 {

    public static void main(String[] args) {

        String path = Constants.BASE_URL + "names.txt";

        if (getData(path).findAny().isPresent())
            getOutput(getData(path));
        else
            System.out.println("No data.");
    }

    private static Stream<String> getData(String path) {
        try {
            return Files.lines(Paths.get(path));
        } catch (IOException e) {
            return Stream.empty();
        }
    }

    private static void getOutput(Stream<String> stream) {
        AtomicInteger cnt = new AtomicInteger(0);
        stream.forEach(name ->
                System.out.println(cnt.incrementAndGet() +
                        ") " + name));
    }
}
