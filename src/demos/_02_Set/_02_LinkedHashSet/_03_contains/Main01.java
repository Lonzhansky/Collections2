package demos._02_Set._02_LinkedHashSet._03_contains;

import java.util.LinkedHashSet;
import java.util.Set;

// Метод contains(Object o) повертає true,
// якщо набір містить вказаний елемент.
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
        System.out.println("Data: " + set);

        // Визначення чи містить набір певний елемент.
        String item = "kiwi";
        if (set.contains(item)) {
            System.out.println("Data contain " + item);
        } else {
            System.out.println("Data do not contain " + item);
        }
    }
}
