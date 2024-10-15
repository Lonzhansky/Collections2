package lesson15.demos._03_TreeMap._01_Map._02_putIfAbsent;

import java.util.Map;
import java.util.TreeMap;

// Метод putIfAbsent(K key, V value).
// Якщо вказаний ключ ще не пов’язано зі значенням
// (або зіставлено з null), він пов’язує його з заданим
// значенням і повертає null, інакше повертає поточне значення.
// Викидає NullPointerException, якщо null ключ.
public class Main01 {

    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("kot7", "kiwi");
        map.put("sat2", null); // <- null значення
        map.put("est8", "mango");
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Додаємо елементи
        // Такий ключ вже має значення
        map.putIfAbsent("abc1", "cherry");
        // Такий ключ має значення null
        map.put("sat2", "cherry");
        // Такого елемента немає
        map.putIfAbsent("gio4", "grape");
        // Виведення елементів
        System.out.println("2) Data: " + map);
    }
}
