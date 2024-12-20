package demos._03_Queue._02_PriorityQueue._02_offer;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод offer(E e) вставляє вказаний елемент в чергу.
// Викидає NullPointerException - якщо вказаний елемент
// має значення null.
public class Main02 {

    public static void main(String[] args) {
        // Створення черги через конструктор PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();
        // Вставлення елементів до черги
        queue.offer(25);
        queue.offer(17);
        queue.offer(98);
        queue.offer(25); // <- Дублікат дозволено
        queue.offer(5);
//        queue.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів
        System.out.println("Data: " + queue);
    }
}
