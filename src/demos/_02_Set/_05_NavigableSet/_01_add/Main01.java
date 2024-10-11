package demos._02_Set._05_NavigableSet._01_add;

import java.util.NavigableSet;
import java.util.TreeSet;

// Метод add(E e) додає елемент до набору,
// якщо його ще немає.
public class Main01 {

    public static void main(String[] args) {
        // Створення набору через конструктор TreeSet
        NavigableSet<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("mango");
        set.add("plum");
        set.add("cherry");
        set.add("mango"); // <- Дублікат недозволено
//        set.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів. Елементи мають бути впорядковані
        // за абеткою в зростаючому порядку.
        System.out.println("Data: " + set);
    }
}
