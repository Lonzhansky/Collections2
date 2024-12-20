package demos._02_Set._03_TreeSet._02_addAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Метод addAll(Collection<? extends E> c) додає
// всі елементи вказаної колекції до набору.
// Викидає
// NullPointerException - якщо вказана колекція має
// значення null або якщо будь-який елемент вказаної
// колекції має значення null.
public class Main {

    public static void main(String[] args) {

        // Створення набору
        Set<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add("avocado");
        set.add("kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + set);

        // Створення списку (колекції)
        List<String> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add("mango");
        list.add("apricot");
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Додавання списку до набору
        set.addAll(list);
        // Виведення елементів
        System.out.println("3) Data: " + set);

        // Додаємо null до списку
        list.add(null);
        // Виведення елементів
        System.out.println("4) Data: " + list);

        // Додавання списку до набору.
        // Маємо обробити виняток.
        try {
            set.addAll(list);
            // Виведення елементів
            System.out.println("5) Data: " + set);
        } catch (NullPointerException e) {
            System.out.println("No data!");
        }
    }
}
