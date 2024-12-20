package demos._03_Queue._01_LinkedList._02_offer;

import java.util.LinkedList;
import java.util.Queue;

// Метод offer(E e) вставляє вказаний елемент в чергу.
// Повертає true, якщо елемент було додано до черги,
// інакше false.
// Цей метод, як правило, є кращим, ніж add(E e),
// який при неуспіху викидає виняток.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор LinkedList
        Queue<String> queue = new LinkedList<>();
        // Вставлення елементів до черги
        queue.offer("orange");
        queue.offer("banana");
        queue.offer("kiwi");
        queue.offer(null); // <- null дозволено
        queue.offer("banana"); // <- Дублікат дозволено
        queue.offer("apple");
        // Виведення елементів
        System.out.println("Data: " + queue);
    }
}
