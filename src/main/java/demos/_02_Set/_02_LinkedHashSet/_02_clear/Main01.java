package demos._02_Set._02_LinkedHashSet._02_clear;

import java.util.LinkedHashSet;
import java.util.Set;

// Метод clear() видаляє всі елементи
// з набору (очищає набір).
public class Main01 {

    public static void main(String[] args) {
        // Створення набору через конструктор LinkedHashSet
        Set<String> set = new LinkedHashSet<>();
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
