package demos._03_Queue._02_PriorityQueue._05_poll;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод poll() отримує та видаляє голову черги
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
        // Видалення та отримання елементу
        // з повної черги
        String item = queue.poll();
        System.out.println("Result is " + item);
        // Виведення елементів після видалення.
        // Склад елементів має змінитися.
        System.out.println("2) Data: " + queue);

        // Очищуємо чергу через метод clear()
        queue.clear();
        // Виведення елементів.
        System.out.println("3) Data: " + queue);
        // Намагаємося видалити елемент з порожньої черги.
        String item1 = queue.poll();
        System.out.println("Result is " + item1);
    }
}
