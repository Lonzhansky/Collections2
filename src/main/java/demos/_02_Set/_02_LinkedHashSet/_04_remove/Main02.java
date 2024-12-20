package demos._02_Set._02_LinkedHashSet._04_remove;

import java.util.LinkedHashSet;
import java.util.Set;

// Метод remove(Object o) видаляє вказаний елемент
// із набору, якщо він присутній.
public class Main02 {

    public static void main(String[] args) {
        // Створення набору через конструктор LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>();
        // Додавання елементів до набору
        set.add(23);
        set.add(17);
        set.add(35);
        set.add(null);
        set.add(8);
        // Виведення елементів
        System.out.println("1) Data: " + set);

        // Видалення елементу, який є
        set.remove(17);
        // Виведення елементів
        System.out.println("2) Data: " + set);

        // Видалення елементу, якого немає.
        // Нічого не відбувається.
        set.remove(48);
        // Виведення елементів
        System.out.println("3) Data: " + set);

        // Видалення елементу null
        set.remove(null);
        // Виведення елементів
        System.out.println("4) Data: " + set);
    }
}
