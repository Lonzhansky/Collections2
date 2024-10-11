package demos._02_Set._03_TreeSet._01_add;

import java.util.Set;
import java.util.TreeSet;

// Метод add(E e) додає елемент до набору,
// якщо його ще немає.
public class Main01 {

    public static void main(String[] args) {
        // Створення набору через конструктор TreeSet
        Set<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add("apple");
        set.add("kiwi");
        set.add("banana"); // <- Дублікат недозволено
//        set.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів. Елементи мають бути впорядковані
        // за абеткою в зростаючому порядку.
        // Виведення елементів
        System.out.println("Data: " + set);
    }
}
