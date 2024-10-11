package demos._03_Queue._02_PriorityQueue._01_add;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод add(E e) вставляє вказаний елемент в чергу.
// Викидає NullPointerException - якщо вказаний елемент
// має значення null.
public class Main02 {

    public static void main(String[] args) {
        // Створення черги через конструктор PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();
        // Вставлення елементів до черги
        queue.add(25);
        queue.add(17);
        queue.add(98);
        queue.add(25); // <- Дублікат дозволено
        queue.add(5);
//        queue.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів
        System.out.println("Data: " + queue);
    }
}
