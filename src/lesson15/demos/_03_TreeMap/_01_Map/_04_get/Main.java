package lesson15.demos._03_TreeMap._01_Map._04_get;

import java.util.Map;
import java.util.TreeMap;

// Метод get(Object key) повертає значення,
// на яке зіставляється вказаний ключ, або null,
// якщо Map не містить зіставлення для ключа.
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
        System.out.println("Data: " + map);

        // Отримання за існуючим ключем
        String value1 = map.get("dvc3");
        System.out.println("Result 1 is " + value1);
        // Отримання за існуючим ключем, де значення null
        String value2 = map.get("est8");
        System.out.println("Result 2 is " + value2);
        // Отримання за неіснуючим ключем
        String value3 = map.get("mye4");
        System.out.println("Result 3 is " + value3);
    }
}
