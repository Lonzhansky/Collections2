package demos._03_Queue._03_Deque._01_LinkedList._10_pollLast;

import java.util.Deque;
import java.util.LinkedList;

// Метод pollLast() отримує та видаляє
// останній елемент черги
// або повертає значення null,
// якщо ця черга порожня.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги
        Deque<String> deque = new LinkedList<>();
        // Додавання елементів
        deque.add("orange");
        deque.add("banana");
        deque.add("kiwi");
        deque.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + deque);

        // Отримуємо та видаляємо елемент з черги.
        String item = deque.pollLast();
        // Виведення елементу
        System.out.println("Item: " + item);
        // Виведення елементів
        System.out.println("2) Data: " + deque);

        // Очищуємо чергу.
        deque.clear();
        // Черга - порожня.
        System.out.println("3) Data: " + deque);
        // Намагаємося отримати елемент із порожньої черги.
        item = deque.pollLast();
        System.out.println("Item: " + item);
    }
}
