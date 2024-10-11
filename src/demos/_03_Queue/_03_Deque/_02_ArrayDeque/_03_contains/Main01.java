package demos._03_Queue._03_Deque._02_ArrayDeque._03_contains;

import java.util.ArrayDeque;
import java.util.Deque;

// Метод contains(Object o) повертає true,
// якщо черга містить вказаний елемент.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги
        Deque<String> deque = new ArrayDeque<>();
        // Додавання елементів
        deque.add("orange");
        deque.add("banana");
        deque.add("kiwi");
        deque.add("apple");
        // Виведення елементів
        System.out.println("Data: " + deque);

        // Визначення чи містить черга певний елемент.
        String item = "kiwi";
        if (deque.contains(item)) {
            System.out.println("Data contain " + item);
        } else {
            System.out.println("Data do not contain " + item);
        }
    }
}
