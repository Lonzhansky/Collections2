package lesson16.demos._05_pkg_JUF._02_BiConsumer;

import java.util.HashMap;
import java.util.Map;

// Функціональний інтерфейс BiConsumer використовується в JDK.
// Одним із прикладів функціонального інтерфейсу BiConsumer,
// є використання методу forEach() для ітерації Map.
// В інтерфейсі Map є метод forEach(), який приймає
// BiConsumer як аргумент.
public class Main05 {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("orange", 1.99);
        map.put("kiwi", 2.95);
        map.put("mango", 3.25);
        map.put("apple", 1.97);

        // public void forEach(java.util.function.BiConsumer<? super K, ? super V> action)
        map.forEach((key, value) ->
                System.out.println("Product " + key +
                        ", price is USD " + value));
    }
}
