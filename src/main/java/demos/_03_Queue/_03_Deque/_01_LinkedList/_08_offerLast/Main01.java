package demos._03_Queue._03_Deque._01_LinkedList._08_offerLast;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

// Метод offerLast(E e) вставляє вказаний елемент
// у кінець черги, якщо це не порушить обмеження ємності.
// При використанні черги з обмеженою ємністю цей метод
// зазвичай є кращим, ніж метод addLast(E), який може
// не вставити елемент лише через викидання винятку.
public class Main01 {

    public static void main(String[] args) {
        // Створення черги через конструктор LinkedList
        Deque<String> deque = new LinkedList<>();
        // Додавання елементів
        deque.add("orange");
        deque.add("banana");
        deque.add("kiwi");
        deque.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + deque);
        // Вставлення елементу
        deque.offerLast("mango");
        // Виведення елементів
        System.out.println("2) Data: " + deque);

        // Створення черги через конструктор LinkedBlockingDeque,
        // через який встановлюємо обмеження ємності.
        Deque<String> deque1 = new LinkedBlockingDeque<>(3);
        // Додаємо елементи, не порушуючи обмеження ємності.
        deque1.add("orange");
        deque1.add("banana");
        deque1.add("kiwi");
        System.out.println("3) Data: " + deque1);
        // Вставляємо елемент, порушуючи обмеження ємності.
        deque1.offerLast("mango");
        // Виведення елементів
        System.out.println("4) Data: " + deque1);

        // Створення черги через конструктор LinkedBlockingDeque,
        // через який встановлюємо обмеження ємності.
        Deque<String> deque2 = new LinkedBlockingDeque<>(4);
        // Додаємо елементи, не порушуючи обмеження ємності.
        deque2.add("orange");
        deque2.add("banana");
        deque2.add("kiwi");
        // Виведення елементів
        System.out.println("5) Data: " + deque2);
        // Вставляємо елемент, не порушуючи обмеження ємності.
        deque2.offerLast("mango");
        // Виведення елементів
        System.out.println("6) Data: " + deque2);
    }
}
