package demos._01_List._01_ArrayList._03_clear;

import java.util.ArrayList;
import java.util.List;

// Метод clear() видаляє всі елементи
// зі списку (очищає список).
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до List
        list.add(25);
        list.add(17);
        list.add(98);
        list.add(25); // <- Дублікат дозволено
        list.add(5);

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
