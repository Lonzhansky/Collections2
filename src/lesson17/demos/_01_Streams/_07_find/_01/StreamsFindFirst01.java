package lesson17.demos._01_Streams._07_find._01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Отримання першого елемента списку,
// де List є джерелом потоку.
public class StreamsFindFirst01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7, 9, 5, 7, 4, 9);
//        List<Integer> list = Arrays.asList();

        Optional<Integer> firstElem = list.stream().findFirst();

        if (firstElem.isPresent()) {
            System.out.println("First element is " +
                    firstElem.get());
        } else {
            System.out.println("No element found!");
        }
    }
}
