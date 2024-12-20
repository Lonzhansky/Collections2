package demos._02_Set._01_HashSet._01_add;

import java.util.HashSet;
import java.util.Set;

// Метод add(E e) додає елемент до набору,
// якщо його ще немає.
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
    }
}