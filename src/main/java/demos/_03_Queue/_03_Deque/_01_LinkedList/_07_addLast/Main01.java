package demos._03_Queue._03_Deque._01_LinkedList._07_addLast;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

// Метод addLast(E e) вставляє зазначений елемент
// у кінець черги, якщо це можливо зробити негайно,
// не порушуючи обмеження на ємність, створюючи виняткову
// ситуацію IllegalStateException, якщо наразі немає
// вільного місця.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор LinkedList.
        Deque<String> deque = new LinkedList<>();
        // Додавання елементів
        deque.add("orange");
        deque.add("banana");
        deque.add("kiwi");
        deque.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + deque);
        // Вставлення елементу
        deque.addLast("mango");
        // Виведення елементів
        System.out.println("2) Data: " + deque);

        // Створення черги через конструктор LinkedBlockingDeque,
        // через який встановлюємо обмеження ємності.
        Deque<String> deque1 = new LinkedBlockingDeque<>(3);
        // Додаємо елементи, не порушуючи обмеження ємності.
        deque1.add("orange");
        deque1.add("banana");
        deque1.add("kiwi");
        // Виведення елементів
        System.out.println("3) Data: " + deque1);
        // Додаємо в повну чергу.
        // Маємо обробити виняток.
        try {
            deque1.addLast("mango");
            System.out.println("4) Data: " + deque1);
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
