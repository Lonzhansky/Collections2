package lesson17.demos._01_Streams._07_find._02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Отримання будь-якого елемента списку,
// де List є джерелом потоку.
public class StreamsFindAny01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7, 9, 5, 7, 4, 9);
//        List<Integer> list = Arrays.asList();

        Optional<Integer> listElem = list.stream().findAny();

        if (listElem.isPresent()) {
            System.out.println("List element is " + listElem.get());
        } else {
            System.out.println("No element found");
        }
    }
}
