package lesson15.demos._01_HashMap._07_containsKey;

import java.util.HashMap;
import java.util.Map;

// Метод containsKey(Object key) повертає true,
// якщо Map містить відображення для вказаного ключа.
public class Main {

    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new HashMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        // Виведення елементів
        System.out.println("Data: " + map);

        // Намагаємося отримати результат за існуючим ключем.
        System.out.print("Result 1 ");
        boolean isContains1 = map.containsKey("sat2");
        if (isContains1) System.out.println("is " + isContains1);
        else System.out.println("is " + isContains1);

        // Намагаємося отримати результат за неіснуючим ключем.
        System.out.print("Result 2 ");
        boolean isContains2 = map.containsKey("syo3");
        if (isContains2) System.out.println("is " + isContains2);
        else System.out.println("is " + isContains2);
    }
}
