package demos._03_Queue._01_LinkedList._04_peek;

import java.util.LinkedList;
import java.util.Queue;

// Метод peek() отримує, але не видаляє голову черги,
// або повертає null, якщо черга порожня.
public class Main {

    public static void main(String[] args) {
        // Створення черги
        Queue<String> queue = new LinkedList<>();
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

        // Створення порожньої черги
        Queue<String> queue1 = new LinkedList<>();
        // Виведення елементів.
        System.out.println("3) Data: " + queue1);
        // Намагаємося отримати елемент з порожньої черги.
        String item1 = queue1.peek();
        System.out.println("Result is " + item1);
    }
}
