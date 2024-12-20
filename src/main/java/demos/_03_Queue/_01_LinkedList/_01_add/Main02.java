package demos._03_Queue._01_LinkedList._01_add;

import java.util.LinkedList;
import java.util.Queue;

// Метод add(E e) вставляє вказаний елемент в чергу.
// Поверне true у разі успіху, інакше викидається виняток
// IllegalStateException, якщо наразі немає вільного місця.
public class Main02 {

    public static void main(String[] args) {
        // Створення черги через конструктор LinkedList
        Queue<Integer> queue = new LinkedList<>();
        // Вставлення елементів до черги
        queue.add(25);
        queue.add(17);
        queue.add(null); // <- null дозволено
        queue.add(98);
        queue.add(25); // <- Дублікат дозволено
        queue.add(5);
        // Виведення елементів
        System.out.println("Data: " + queue);
    }
}
