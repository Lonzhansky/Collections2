package lesson15.demos._03_TreeMap._02_SortedMap._01_firstKey;

import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;

// Метод firstKey() повертає перший (найнижчий) ключ в Map.
// Викидає NoSuchElementException - якщо Map порожній.
public class Main {

    public static void main(String[] args) {
        // Створюємо Map
        SortedMap<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Намагаємося отримати ключ
        String key = map.firstKey();
        System.out.println("Result 1 is " + key);

        // Очищуємо Map
        map.clear();
        // Виведення елементів
        System.out.println("2) Data: " + map);

        // Намагаємося отримати ключ.
        // Маємо обробити виняток.
        try {
            key = map.firstKey();
            System.out.println("Result 2 is " + key);
        } catch (NoSuchElementException e) {
            System.out.println("Result 2 is " + e.getMessage());
        }
    }
}
