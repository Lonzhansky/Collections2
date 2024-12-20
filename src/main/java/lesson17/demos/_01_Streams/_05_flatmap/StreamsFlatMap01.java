package lesson17.demos._01_Streams._05_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Функція flatMap() з операцією зіставлення рядка
// із символом в індексі 2.
// Тут, виведення символу рядка, що у індексі 2.
public class StreamsFlatMap01 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Orange", "ONION",
                "VeryLongStringEver", "kiwi");

        list.stream()
                .flatMap(str -> Stream.of(str.charAt(2)))
                .forEach(System.out::println);
    }
}
