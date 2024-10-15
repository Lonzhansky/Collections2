package lesson15.demos._03_TreeMap._01_Map._05_getOrDefault;

import java.util.Map;
import java.util.TreeMap;

// Метод getOrDefault(Object key, V defaultValue)
// повертає значення, на яке зіставляється вказаний ключ,
// або defaultValue, якщо Map не містить зіставлення для ключа.
//
// Різниця між методами get(Object key) та
// getOrDefault(Object key, V defaultValue).
// Якщо вказаний ключ існує, обидва методи повертають
// значення, пов'язане із зазначеним ключем.
// Але якщо ключ не існує, метод get повертає значення null,
// а метод getOrDefault повертає значення, що вказане за
// замовчуванням (defaultValue).
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

        // Отримання за існуючим ключем,
        // який має зіставлене значення
        String value1 = map.getOrDefault("dvc3", "mango");
        System.out.println("Result 1 is " + value1);
        // Отримання за існуючим ключем,
        // який має зіставлене значення null.
        String value2 = map.getOrDefault("est8", "mango");
        System.out.println("Result 2 is " + value2);
        // Отримання за неіснуючим ключем,
        // то просто defaultValue.
        String value3 = map.getOrDefault("mye4", "mango");
        System.out.println("Result 3 is " + value3);

        // Виведення елементів. Дані - не зміняться.
        System.out.println("2) Data: " + map);
    }
}
