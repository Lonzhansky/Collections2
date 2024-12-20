package demos._03_Queue._03_Deque._02_ArrayDeque._06_remove;

import java.util.ArrayDeque;
import java.util.Deque;

// Метод remove(Object o) вилучає один екземпляр
// зазначеного елемента з черги, якщо він
// присутній.
public class Main {

    public static void main(String[] args) {
        // Створення черги
        Deque<String> deque = new ArrayDeque<>();
        // Вставлення елементів до черги
        deque.add("orange");
        deque.add("banana");
        deque.add("kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + deque);

        // Вилучення з черги елементу, який є
        boolean isRemoved = deque.remove("kiwi");
        System.out.println("Result is " + isRemoved);
        // Виведення елементів після вилучення елементу.
        // Склад елементів має змінитися.
        System.out.println("2) Data: " + deque);


        // Вилучення з черги елементу, якого немає
        boolean isRemoved1 = deque.remove("apricot");
        System.out.println("Result is " + isRemoved1);
        // Виведення елементів після вилучення елементу.
        // Склад елементів не має змінитися.
        System.out.println("3) Data: " + deque);
    }
}
