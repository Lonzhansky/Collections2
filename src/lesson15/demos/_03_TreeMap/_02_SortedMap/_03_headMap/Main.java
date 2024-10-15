package lesson15.demos._03_TreeMap._02_SortedMap._03_headMap;

import java.util.SortedMap;
import java.util.TreeMap;

// Метод headMap(K toKey) повертає перегляд частини Map,
// ключі якого суворо менші за toKey.
public class Main {

    public static void main(String[] args) {
        // Створюємо Map
        SortedMap<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        map.put("kyo7", "kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Намагаємося отримати дані
        SortedMap<String, String> map1 =
                map.headMap("est8");
        System.out.println("2) Data: " + map1);
    }
}
