package demos._03_Queue._01_LinkedList._03_element;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

// Метод element() отримує, але не видаляє голову черги.
// Викидає NoSuchElementException - якщо черга порожня.
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
        String item = queue.element();
        System.out.println("Result is " + item);
        // Виведення елементів після отримання.
        // Склад елементів не має змінитися.
        System.out.println("2) Data: " + queue);

        // Створення порожньої черги
        Queue<String> queue1 = new LinkedList<>();
        // Виведення елементів.
        System.out.println("3) Data: " + queue1);
        // Намагаємося отримати елемент з порожньої черги.
        // Маємо обробити виняток.
        try {
            String item1 = queue1.element();
            System.out.println("Result is " + item1);
        } catch (NoSuchElementException e) {
            System.out.println("No data!");
        }
    }
}
