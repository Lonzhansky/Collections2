package demos._02_Set._03_TreeSet._03_remove;

import java.util.Set;
import java.util.TreeSet;

// Метод remove(Object o) видаляє вказаний елемент
// із набору, якщо він присутній.
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

        // Видалення елементу, який є
        set.remove("kiwi");
        // Виведення елементів
        System.out.println("2) Data: " + set);

        // Видалення елементу, якого немає.
        // Нічого не відбувається.
        set.remove("mango");
        // Виведення елементів
        System.out.println("3) Data: " + set);
    }
}
