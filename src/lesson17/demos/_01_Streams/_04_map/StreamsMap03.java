package lesson17.demos._01_Streams._04_map;

import java.util.Arrays;
import java.util.List;

// Функція Stream map() з операцією
// відображення довжини рядка замість рядка.
public class StreamsMap03 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Oranges", "IF", "CLASS",
                "VeryLongStringEver");

//        list.stream().map(str -> str.length())
//                .forEach(System.out::println);

        list.stream().map(String::length)
                .forEach(System.out::println);
    }
}
