package lesson17.demos._01_Streams._03_filter._01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Фільтрація Map за ключами та значеннями
public class StreamsFilter13 {

    public static void main(String[] args) {

        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(8, "Apple");
        hmap.put(2, "Plum");
        hmap.put(6, "Cheese");
        hmap.put(4, "Orange");
        hmap.put(1, "Pear");
        hmap.put(9, "Pear");

        hmap.entrySet()
                .stream()
                .filter(p -> p.getKey() <= 2) // фільтр за ключем
                .filter(map -> map.getValue().startsWith("P")) // фільтр за значенням
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
