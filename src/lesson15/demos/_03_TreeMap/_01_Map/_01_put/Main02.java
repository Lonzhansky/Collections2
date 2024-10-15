package lesson15.demos._03_TreeMap._01_Map._01_put;

import java.util.Map;
import java.util.TreeMap;

// Метод put(K key, V value) пов’язує вказане значення
// з указаним ключем у Map.
// Якщо Map раніше містив відображення для ключа,
// старе значення буде замінено.
// Викидає NullPointerException, якщо null ключ.
public class Main02 {

    public static void main(String[] args) {
        // Створюємо Map
        Map<Integer, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put(258, "orange");
        map.put(127, "apricot");
        map.put(127, "plum"); // <- Дублікат ключа
//        map.put(null, "pepper"); // <- null ключ недозволено
        map.put(405, "pepper");
        map.put(318, null); // <- null значення
        // Виведення елементів
        System.out.println("Data: " + map);
    }
}
