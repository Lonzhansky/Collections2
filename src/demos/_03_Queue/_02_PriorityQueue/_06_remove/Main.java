package demos._03_Queue._02_PriorityQueue._06_remove;

import java.util.PriorityQueue;
import java.util.Queue;

// Метод remove(Object o) вилучає один екземпляр
// зазначеного елемента з черги, якщо він
// присутній.
public class Main {

    public static void main(String[] args) {
        // Створення черги
        Queue<String> queue = new PriorityQueue<>();
        // Вставлення елементів до черги
        queue.add("orange");
        queue.add("banana");
        queue.add("kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + queue);

        // Вилучення з черги елементу, який є
        boolean isRemoved = queue.remove("kiwi");
        System.out.println("Result is " + isRemoved);
        // Виведення елементів після вилучення елементу.
        // Склад елементів має змінитися.
        System.out.println("2) Data: " + queue);


        // Вилучення з черги елементу, якого немає
        boolean isRemoved1 = queue.remove("apricot");
        System.out.println("Result is " + isRemoved1);
        // Виведення елементів після вилучення елементу.
        // Склад елементів не має змінитися.
        System.out.println("3) Data: " + queue);
    }
}
