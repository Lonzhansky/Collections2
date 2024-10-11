package demos._03_Queue._03_Deque._01_LinkedList._05_getFirst;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

// Метод getFirst() отримує, але не видаляє,
// перший елемент черги.
// Викидає NoSuchElementException - якщо ця черга
// порожня.
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
        // Отримання елементу
        String item = deque.getFirst();
        System.out.println("Item is " + item);
        // Виведення елементів
        System.out.println("2) Data: " + deque);

        // Очищуємо чергу
        deque.clear();
        // Виведення елементів
        System.out.println("3) Data: " + deque);
        // Намагаємося отримати елемент.
        // Маємо обробити виняток.
        try {
            String item1 = deque.getFirst();
            System.out.println("Item is " + item1);
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
