package demos._03_Queue._03_Deque._02_ArrayDeque._01_add;

import java.util.ArrayDeque;
import java.util.Deque;

// Метод add(E e) вставляє вказаний елемент в чергу.
// Викидає NullPointerException - якщо вказаний елемент
// має значення null.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        // Вставлення елементів до черги
        deque.add("orange");
        deque.add("banana");
        deque.add("kiwi");
        deque.add("banana"); // <- Дублікат дозволено
        deque.add("apple");
//        deque.add(null); // <- null недозволено, може бути виняток
        // Виведення елементів
        System.out.println("Data: " + deque);
    }
}
