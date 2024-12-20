package demos._03_Queue._01_LinkedList._01_add;

import java.util.LinkedList;
import java.util.Queue;

// Метод add(E e) вставляє вказаний елемент в чергу.
// Поверне true у разі успіху, інакше викидається виняток
// IllegalStateException, якщо наразі немає вільного місця.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор LinkedList
        Queue<String> queue = new LinkedList<>();
        // Вставлення елементів до черги
        queue.add("orange");
        queue.add("banana");
        queue.add("kiwi");
        queue.add(null); // <- null дозволено
        queue.add("banana"); // <- Дублікат дозволено
        queue.add("apple");
        // Виведення елементів
        System.out.println("Data: " + queue);
    }
}
