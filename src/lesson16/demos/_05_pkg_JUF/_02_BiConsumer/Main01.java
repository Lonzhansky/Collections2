package lesson16.demos._05_pkg_JUF._02_BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

// Створюємо Map, потім відображаємо записи Map.
// Використовуємо лямбда-вираз, що реалізує
// функціональний інтерфейс BiConsumer,
// а саме метод accept() інтерфейсу BiConsumer.
public class Main01 {

    public static void main(String[] args) {

        BiConsumer<String, Double> biConsumer = (name, price) ->
                System.out.println("Product " + name +
                        ", price is USD " + price);

        Map<String, Double> map = new HashMap<>();
        map.put("orange", 1.99);
        map.put("kiwi", 2.95);
        map.put("mango", 3.25);
        map.put("apple", 1.97);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }
}
