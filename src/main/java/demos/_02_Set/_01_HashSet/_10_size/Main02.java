package demos._02_Set._01_HashSet._10_size;

import java.util.HashSet;
import java.util.Set;

// Метод size() повертає кількість елементів у наборі.
public class Main02 {

    public static void main(String[] args) {
        // Створення набору через конструктор HashSet
        Set<Integer> set = new HashSet<>();
        // Додавання елементів до набору
        set.add(23);
        set.add(17);
        set.add(null); // <- null дозволено
        set.add(35);
        set.add(17); // <- Дублікат недозволено
        set.add(8);
        // Виведення елементів
        System.out.println("Data: " + set);
        // Визначення кількості елементів
        int setSize = set.size();
        // Виведення кількості елементів
        System.out.println("Size is " + setSize);
    }
}
