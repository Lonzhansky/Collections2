package lesson15.demos._03_TreeMap._03_NavigableMap._01_ceilingEntry;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

// Метод ceilingEntry(K key) повертає зіставлення ключ-значення,
// пов’язане з найменшим ключем, більшим або рівним заданому ключу,
// або null, якщо такого ключа немає.
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

        // Намагаємося отримати дані за існуючим ключем
        Map.Entry<String, String> map1 =
                map.ceilingEntry("est8");
        // Виведення елементів
        System.out.println("2) Data: " + map1);

        // Намагаємося отримати дані за неіснуючим ключем,
        // який не за межами Map
        Map.Entry<String, String> map2 =
                map.ceilingEntry("feo5");
        // Виведення елементів
        System.out.println("3) Data: " + map2);

        // Намагаємося отримати дані за неіснуючим ключем,
        // який за межами Map
        Map.Entry<String, String> map3 =
                map.ceilingEntry("soi4");
        // Виведення елементів
        System.out.println("4) Data: " + map3);
    }
}
