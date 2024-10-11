package demos._02_Set._01_HashSet._10_size;

import java.util.HashSet;
import java.util.Set;

// Метод size() повертає кількість елементів у наборі.
public class Main01 {

    public static void main(String[] args) {
        // Створення набору через конструктор HashSet
        Set<String> set = new HashSet<>();
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
