package demos._02_Set._02_LinkedHashSet._05_size;

import java.util.LinkedHashSet;
import java.util.Set;

// Метод size() повертає кількість елементів у наборі.
public class Main01 {

    public static void main(String[] args) {
        // Створення набору через конструктор LinkedHashSet
        Set<String> set = new LinkedHashSet<>();
        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add(null); // <- null дозволено
        set.add("kiwi");
        set.add("banana"); // <- Дублікат недозволено
        set.add("apple");
        // Виведення елементів
        System.out.println("Data: " + set);
        // Визначення кількості елементів
        int setSize = set.size();
        // Виведення кількості елементів
        System.out.println("Size is " + setSize);
    }
}
