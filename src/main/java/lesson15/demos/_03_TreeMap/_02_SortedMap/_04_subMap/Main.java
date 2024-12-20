package lesson15.demos._03_TreeMap._02_SortedMap._04_subMap;

import java.util.SortedMap;
import java.util.TreeMap;

// Метод subMap(K fromKey, K toKey) повертає вигляд
// частини Map, ключі якого варіюються від fromKey, включно,
// до toKey, винятково.
// Якщо fromKey та toKey рівні, повернутий Map буде порожнім.
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

        // Намагаємося отримати дані. Ключі - різні.
        SortedMap<String, String> map1 =
                map.subMap("dvc3", "kyo7");
        System.out.println("2) Data: " + map1);

        // Намагаємося отримати дані. Ключі - рівні.
        SortedMap<String, String> map2 =
                map.subMap("dvc3", "dvc3");
        System.out.println("3) Data: " + map2);
    }
}
