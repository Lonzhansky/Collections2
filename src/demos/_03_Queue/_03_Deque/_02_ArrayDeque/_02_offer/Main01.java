package demos._03_Queue._03_Deque._02_ArrayDeque._02_offer;

import java.util.ArrayDeque;
import java.util.Deque;

// Метод offer(E e) вставляє вказаний елемент в чергу.
// Викидає NullPointerException - якщо вказаний елемент
// має значення null.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        // Вставлення елементів до черги
        deque.offer("orange");
        deque.offer("banana");
        deque.offer("kiwi");
        deque.offer("banana"); // <- Дублікат дозволено
        deque.offer("apple");
//        deque.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів
        System.out.println("Data: " + deque);
    }
}
