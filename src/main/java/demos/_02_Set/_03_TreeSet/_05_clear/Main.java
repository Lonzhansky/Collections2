package demos._02_Set._03_TreeSet._05_clear;

import java.util.Set;
import java.util.TreeSet;

// Метод clear() видаляє всі елементи
// з набору (очищає набір).
public class Main {

    public static void main(String[] args) {
        // Створення набору
        Set<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add("kiwi");
        set.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + set);
        // Очищення набору
        set.clear();
        // Виведення набору після очищення.
        // Тобто об'єкт набору становиться просто порожнім,
        // але не видаляється.
        System.out.println("2) Data: " + set);
    }
}
