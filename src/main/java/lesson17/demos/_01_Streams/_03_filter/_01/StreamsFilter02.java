package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;

// Можемо створити потік та
// застосувати фільтр в одному рядку.
public class StreamsFilter02 {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Michael", "Linda", "John", "Elizabeth", "Paul");

        List<String> longNames = names.stream() // Перетворення списку в поток
                .filter(str -> str.length() > 5) // Фільтруємо поток для нового потоку
                .toList();  // Накопичуємо елементи цього потоку для списку

        longNames.forEach(System.out::println);
    }
}
