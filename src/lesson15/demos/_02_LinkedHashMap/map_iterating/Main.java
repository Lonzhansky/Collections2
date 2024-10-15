package lesson15.demos._02_LinkedHashMap.map_iterating;

import java.util.LinkedHashMap;
import java.util.Map;

// Ітерація по Map
public class Main {

    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new LinkedHashMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put(null, "pepper"); // <- null ключ
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення

        // Виведення елементів через for-each.
        // Метод getKey() повертає ключ.
        // Метод getValue() повертає значення.
        System.out.println("\n1) Data: ");
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "=" + m.getValue());
        }

        // Виведення елементів через
        // forEach(BiConsumer<? super K,? super V> action)
        // виконує вказану дію для кожного запису в Map,
        // доки всі записи не будуть оброблені або дія
        // не викличе виняток.
        System.out.println("\n2) Data: ");
        map.forEach(
                // Лямбда-вираз, який стосується галузі
                // функціонального програмування (розглядається окремо).
                (key, value) ->
                        System.out.println(key + "=" + value)
        );
    }
}
