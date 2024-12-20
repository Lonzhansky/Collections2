package demos._01_List._02_LinkedList._07_removeLast;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

// Метод removeLast() вилучає та повертає
// останній елемент із списку.
// Викидає NoSuchElementException - якщо список
// порожній.
public class Main02 {

    public static void main(String[] args) {

        // Створення списку через конструктор LinkedList
        List<Integer> list = new LinkedList<>();
        // Додавання елементів до списку
        list.add(25);
        list.add(17);
        list.add(98);
        list.add(5);
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Вилучаємо та повертаємо елемент із списку.
        Integer item = list.removeLast();
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
            item = list.removeLast();
            System.out.println("Item: " + item);
        } catch (NoSuchElementException e) {
            System.out.println("No data!");
        }
    }
}
