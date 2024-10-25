package lesson17.demos._01_Streams._03_filter._01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Фільтрація Map за ключами
public class StreamsFilter11 {

    public static void main(String[] args) {

        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(101, "Apple");
        hmap.put(202, "Orange");
        hmap.put(303, "Kiwi");
        hmap.put(404, "Banana");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> map.getKey() <= 202)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));

        System.out.println("Result: " + result);
    }
}
