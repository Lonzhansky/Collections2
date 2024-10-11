package demos._03_Queue._03_Deque._01_LinkedList._11_getLast;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

// Метод getLast() отримує, але не видаляє,
// останній елемент черги.
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
        String item = deque.getLast();
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
            String item1 = deque.getLast();
            System.out.println("Item is " + item1);
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
