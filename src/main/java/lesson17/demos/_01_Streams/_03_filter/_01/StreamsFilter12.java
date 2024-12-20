package lesson17.demos._01_Streams._03_filter._01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Фільтрація Map за значеннями
public class StreamsFilter12 {

    public static void main(String[] args) {

        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");
        hmap.put(55, "Orange");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> "Orange".equals(map.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));

        System.out.println("Result: " + result);
    }
}
