package lesson17.demos._01_Streams._04_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Функція Stream map() з операцією
// перетворення нижнього регістру у верхній.
public class StreamsMap02 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("orange", "apple", "plum",
                "grape");

        List<String> list1 = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(list1);

        System.out.println(list);
    }
}
