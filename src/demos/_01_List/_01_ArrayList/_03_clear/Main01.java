package demos._01_List._01_ArrayList._03_clear;

import java.util.ArrayList;
import java.util.List;

// Метод clear() видаляє всі елементи
// зі списку (очищає список).
public class Main01 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("banana"); // <- Дублікат дозволено
        list.add("apple");

        // Попереднє виведення списку.
        System.out.println("1) Data: " + list);
        // Видалення всіх елементів зі списку (очищення списку).
        list.clear();
        // Виведення списку після очищення.
        // Тобто об'єкт списку становиться просто порожнім,
        // але не видаляється.
        System.out.println("2) Data: " + list);
    }
}
