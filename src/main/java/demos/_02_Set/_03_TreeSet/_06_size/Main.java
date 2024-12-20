package demos._02_Set._03_TreeSet._06_size;

import java.util.Set;
import java.util.TreeSet;

// Метод size() повертає кількість елементів у наборі.
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
        System.out.println("Data: " + set);
        // Визначення кількості елементів
        int setSize = set.size();
        // Виведення кількості елементів
        System.out.println("Size is " + setSize);
    }
}
