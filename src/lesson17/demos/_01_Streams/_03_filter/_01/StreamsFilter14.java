package lesson17.demos._01_Streams._03_filter._01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Фільтрація Map за ключами та значеннями.
// Застосування equals() або matches()
public class StreamsFilter14 {

    public static void main(String[] args) {

        Map<String, String> hmap = new HashMap<>();
        hmap.put("OPL", "Apple");
        hmap.put("2DD", "Plum");
        hmap.put("6-G", "Cheese");
        hmap.put("RR4", "Orange");
        hmap.put("QU8", "Pear");
        hmap.put("UY9", "Pear");

        hmap.entrySet()
                .stream()
                .filter(p -> "QU8".equals(p.getKey())) // <- equals()
//                .filter(p -> "QU8".matches(p.getKey())) // <- matches()
                .filter(map -> map.getValue().startsWith("P")) // фільтр за значенням
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
