package demos._03_Queue._02_PriorityQueue._02_offer;

import java.util.PriorityQueue;
import java.util.Queue;

// Створили чергу та вставили 5 і 3 в чергу.
// Хоча 5 вставляється перед 3, голова черги дорівнює 3.
// Це тому, що голова цієї черги є найменшим елементом черги.
// Потім вставили 2 у чергу. Тепер чергу змінено,
// щоб зберігати найменший елемент 2 в голові черги.
public class Main03 {

    public static void main(String[] args) {
        // Створення черги через конструктор PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();
        // Метод add(E e) вставляє вказаний елемент в чергу.
        queue.add(5);
        queue.add(3);
        System.out.println("1) Data: " + queue);
        // Метод offer(E e) вставляє вказаний елемент в чергу.
        queue.offer(2);
        System.out.println("2) Data: " + queue);
    }
}
