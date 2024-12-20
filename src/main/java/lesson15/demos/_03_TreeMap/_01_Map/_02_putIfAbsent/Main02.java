package lesson15.demos._03_TreeMap._01_Map._02_putIfAbsent;

import java.util.Map;
import java.util.TreeMap;

// Метод putIfAbsent(K key, V value).
// Якщо вказаний ключ ще не пов’язано зі значенням
// (або зіставлено з null), він пов’язує його з заданим
// значенням і повертає null, інакше повертає поточне значення.
// Викидає NullPointerException, якщо null ключ.
public class Main02 {

    public static void main(String[] args) {
        // Створюємо Map
        Map<Integer, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put(322, "orange");
        map.put(124, "apricot");
        map.put(363, "kiwi");
        map.put(407, null); // <- null значення
        map.put(807, "mango");
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Додаємо елементи
        // Такий ключ вже має значення
        map.putIfAbsent(322, "cherry");
        // Такий ключ має значення null
        map.put(407, "cherry");
        // Такого елемента немає
        map.putIfAbsent(552, "grape");
        // Виведення елементів
        System.out.println("2) Data: " + map);
    }
}
