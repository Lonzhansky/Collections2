package demos._03_Queue._03_Deque._01_LinkedList._09_removeLast;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

// Метод removeLast() отримує та видаляє
// останній елемент черги.
// Викидає NoSuchElementException - якщо
// черга порожня.
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
        String item = deque.removeLast();
        // Виведення елементу
        System.out.println("Item: " + item);
        // Виведення елементів
        System.out.println("2) Data: " + deque);

        // Очищуємо чергу.
        deque.clear();
        // Черга - порожня.
        System.out.println("3) Data: " + deque);
        // Намагаємося отримати елемент із порожньої черги.
        // Одночасно обробляємо виняток.
        try {
            item = deque.removeLast();
            System.out.println("Item: " + item);
        } catch (NoSuchElementException e) {
            System.out.println("No data!");
        }
    }
}
