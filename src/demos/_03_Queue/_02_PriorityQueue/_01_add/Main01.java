package demos._03_Queue._02_PriorityQueue._01_add;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод add(E e) вставляє вказаний елемент в чергу.
// Викидає NullPointerException - якщо вказаний елемент
// має значення null.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор PriorityQueue
        Queue<String> queue = new PriorityQueue<>();
        // Вставлення елементів до черги
        queue.add("orange");
        queue.add("banana");
        queue.add("kiwi");
        queue.add("banana"); // <- Дублікат дозволено
        queue.add("apple");
//        queue.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів
        System.out.println("Data: " + queue);
    }
}
