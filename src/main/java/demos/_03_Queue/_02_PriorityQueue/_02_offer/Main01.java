package demos._03_Queue._02_PriorityQueue._02_offer;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод offer(E e) вставляє вказаний елемент в чергу.
// Викидає NullPointerException - якщо вказаний елемент
// має значення null.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор PriorityQueue
        Queue<String> queue = new PriorityQueue<>();
        // Вставлення елементів до черги
        queue.offer("orange");
        queue.offer("banana");
        queue.offer("kiwi");
        queue.offer("banana"); // <- Дублікат дозволено
        queue.offer("apple");
//        queue.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів
        System.out.println("Data: " + queue);
    }
}
