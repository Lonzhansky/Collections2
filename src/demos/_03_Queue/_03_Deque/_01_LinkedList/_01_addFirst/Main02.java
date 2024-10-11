package demos._03_Queue._03_Deque._01_LinkedList._01_addFirst;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

// Метод addFirst(E e) вставляє зазначений елемент
// на початок черги, якщо це можливо зробити негайно,
// не порушуючи обмеження ємності, створюючи виняткову
// ситуацію IllegalStateException, якщо наразі немає
// вільного місця.
public class Main02 {

    public static void main(String[] args) {
        // Створення черги через конструктор LinkedList
        Deque<Integer> deque = new LinkedList<>();
        // Додавання елементів
        deque.add(25);
        deque.add(17);
        deque.add(98);
        deque.add(5);
        // Виведення елементів
        System.out.println("1) Data: " + deque);
        // Вставлення елементу
        deque.addFirst(39);
        // Виведення елементів
        System.out.println("2) Data: " + deque);

        // Створення черги через конструктор LinkedBlockingDeque,
        // через який встановлюємо обмеження ємності.
        Deque<Integer> deque1 = new LinkedBlockingDeque<>(3);
        // Додаємо елементи, не порушуючи обмеження ємності.
        deque1.add(25);
        deque1.add(17);
        deque1.add(98);
        // Виведення елементів
        System.out.println("3) Data: " + deque1);
        // Додаємо в повну чергу.
        // Маємо обробити виняток.
        try {
            deque1.addFirst(39);
            System.out.println("4) Data: " + deque1);
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
