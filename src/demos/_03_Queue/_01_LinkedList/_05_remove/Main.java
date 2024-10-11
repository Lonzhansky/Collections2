package demos._03_Queue._01_LinkedList._05_remove;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

// Метод remove() отримує та видаляє голову черги.
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
        // Видалення та отримання елементу
        // з повної черги
        String item = queue.remove();
        System.out.println("Result is " + item);
        // Виведення елементів після видалення.
        // Склад елементів має змінитися.
        System.out.println("2) Data: " + queue);

        // Створення порожньої черги
        Queue<String> queue1 = new LinkedList<>();
        // Виведення елементів.
        System.out.println("3) Data: " + queue1);
        // Намагаємося видалити елемент з порожньої черги.
        // Маємо обробити виняток.
        try {
            String item1 = queue1.remove();
            System.out.println("Result is " + item1);
        } catch (NoSuchElementException e) {
            System.out.println("No data!");
        }
    }
}
