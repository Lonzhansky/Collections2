package demos._03_Queue._03_Deque._02_ArrayDeque._05_poll;

import java.util.ArrayDeque;
import java.util.Deque;

// Метод poll() отримує та видаляє голову черги
// або повертає null, якщо черга порожня.
public class Main {

    public static void main(String[] args) {
        // Створення черги
        Deque<String> deque = new ArrayDeque<>();
        // Вставлення елементів до черги
        deque.add("orange");
        deque.add("banana");
        deque.add("kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + deque);
        // Видалення та отримання елементу
        // з повної черги
        String item = deque.poll();
        System.out.println("Result is " + item);
        // Виведення елементів після видалення.
        // Склад елементів має змінитися.
        System.out.println("2) Data: " + deque);

        // Очищуємо чергу через метод clear()
        deque.clear();
        // Виведення елементів.
        System.out.println("3) Data: " + deque);
        // Намагаємося видалити елемент з порожньої черги.
        String item1 = deque.poll();
        System.out.println("Result is " + item1);
    }
}
