package demos._02_Set._01_HashSet._01_add;

import java.util.HashSet;
import java.util.Set;

// Метод add(E e) додає елемент до набору,
// якщо його ще немає.
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
    }
}
