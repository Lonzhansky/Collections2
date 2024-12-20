package demos._02_Set._01_HashSet._07_remove;

import java.util.HashSet;
import java.util.Set;

// Метод remove(Object o) видаляє вказаний елемент
// із набору, якщо він присутній.
public class Main01 {

    public static void main(String[] args) {
        // Створення набору через конструктор HashSet
        Set<String> set = new HashSet<>();
        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add("kiwi");
        set.add(null);
        set.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + set);

        // Видалення елементу, який є
        set.remove("kiwi");
        // Виведення елементів
        System.out.println("2) Data: " + set);

        // Видалення елементу, якого немає.
        // Нічого не відбувається.
        set.remove("mango");
        // Виведення елементів
        System.out.println("3) Data: " + set);

        // Видалення елементу null
        set.remove(null);
        // Виведення елементів
        System.out.println("4) Data: " + set);
    }
}