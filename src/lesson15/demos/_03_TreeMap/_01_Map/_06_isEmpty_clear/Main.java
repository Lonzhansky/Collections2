package lesson15.demos._03_TreeMap._01_Map._06_isEmpty_clear;

import java.util.Map;
import java.util.TreeMap;

// Метод clear() видаляє всі зіставлення з Map,
// тобто Map буде порожнім.
//
// Метод isEmpty() повертає true, якщо Map
// не містить зіставлень ключ-значення.
public class Main {

    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        // Виведення елементів
        System.out.println("1) Data: " + map);

        System.out.print("Result 1: ");
        if (map.isEmpty())
            System.out.println("No data!");
        else System.out.println("Data are present.");

        // Видаляємо дані
        map.clear();
        // Виведення елементів
        System.out.println("2) Data: " + map);

        System.out.print("Result 2: ");
        if (map.isEmpty())
            System.out.println("No data!");
        else System.out.println("Data are present.");
    }
}
