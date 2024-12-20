package demos._03_Queue._02_PriorityQueue._03_contains;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод contains(Object o) повертає true,
// якщо черга містить вказаний елемент.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги
        Queue<String> queue = new PriorityQueue<>();
        // Додавання елементів
        queue.add("orange");
        queue.add("banana");
        queue.add("kiwi");
        queue.add("apple");
        // Виведення елементів
        System.out.println("Data: " + queue);

        // Визначення чи містить черга певний елемент.
        String item = "kiwi";
        if (queue.contains(item)) {
            System.out.println("Data contain " + item);
        } else {
            System.out.println("Data do not contain " + item);
        }
    }
}
