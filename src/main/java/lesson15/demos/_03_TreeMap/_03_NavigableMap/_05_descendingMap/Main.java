package lesson15.demos._03_TreeMap._03_NavigableMap._05_descendingMap;

import java.util.NavigableMap;
import java.util.TreeMap;

// Метод descendingMap() повертає відображення у зворотному порядку,
// які містяться в Map.
public class Main {

    public static void main(String[] args) {
        // Створюємо Map
        NavigableMap<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        map.put("kyo7", "kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Намагаємося отримати дані
        NavigableMap<String, String> map1 =
                map.descendingMap();
        // Виведення елементів
        System.out.println("2) Data: " + map1);
    }
}
