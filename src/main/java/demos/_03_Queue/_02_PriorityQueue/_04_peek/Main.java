package demos._03_Queue._02_PriorityQueue._04_peek;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод peek() отримує, але не видаляє голову черги,
// або повертає null, якщо черга порожня.
public class Main {

    public static void main(String[] args) {
        // Створення черги
        Queue<String> queue = new PriorityQueue<>();
        // Вставлення елементів до черги
        queue.add("orange");
        queue.add("banana");
        queue.add("kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + queue);
        // Отримання елементу з повної черги
        String item = queue.peek();
        System.out.println("Result is " + item);
        // Виведення елементів після отримання.
        // Склад елементів не має змінитися.
        System.out.println("2) Data: " + queue);

        // Очищуємо чергу через метод clear()
        queue.clear();
        // Виведення елементів.
        System.out.println("3) Data: " + queue);
        // Намагаємося отримати елемент з порожньої черги.
        String item1 = queue.peek();
        System.out.println("Result is " + item1);
    }
}
