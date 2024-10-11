package demos._01_List._02_LinkedList._06_removeFirst;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

// Метод removeFirst() вилучає та повертає
// перший елемент із списку.
// Викидає NoSuchElementException - якщо список
// порожній.
public class Main01 {

    public static void main(String[] args) {

        // Створення списку через конструктор LinkedList
        List<String> list = new LinkedList<>();
        // Додавання елементів до списку
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Вилучаємо та повертаємо елемент із списку.
        String item = list.removeFirst();
        // Виведення елементу
        System.out.println("Item: " + item);

        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Очищуємо список.
        list.clear();
        // Список - порожній.
        System.out.println("3) Data: " + list);

        // Намагаємося отримати елемент із порожнього списку.
        // Одночасно обробляємо виняток.
        try {
            item = list.removeFirst();
            System.out.println("Item: " + item);
        } catch (NoSuchElementException e) {
            System.out.println("No data!");
        }
    }
}
