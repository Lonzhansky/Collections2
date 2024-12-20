package demos._02_Set._05_NavigableSet._01_add;

import java.util.NavigableSet;
import java.util.TreeSet;

// Метод add(E e) додає елемент до набору,
// якщо його ще немає.
public class Main02 {

    public static void main(String[] args) {
        // Створення набору через конструктор TreeSet
        NavigableSet<Integer> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add(23);
        set.add(17);
        set.add(9);
        set.add(23); // <- Дублікат недозволено
//        set.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів. Елементи мають бути впорядковані
        // за значеннями в зростаючому порядку.
        System.out.println("Data: " + set);
    }
}
