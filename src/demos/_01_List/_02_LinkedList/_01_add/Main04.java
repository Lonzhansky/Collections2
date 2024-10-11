package demos._01_List._02_LinkedList._01_add;

import java.util.LinkedList;
import java.util.List;

// Імітування помилки виводу з обробкою винятку
public class Main04 {

    public static void main(String[] args) {

        // Створення List через конструктор LinkedList
        List<String> list = new LinkedList<>();
        list.add("orange"); // <- Індекс 0
        list.add("kiwi"); // <- Індекс 1
        list.add("apple"); // <- Індекс 2
        list.add("mango"); // <- Індекс 3
        list.add("grape"); // <- Індекс 4
        // Попереднє виведення списку.
        System.out.println("A. Data: " + list);

        // Обробка виняткової ситуації.
        try {
            // Намагаємося додати елемент поза межами списку,
            // які встановлені певними індексами.
            list.add(9, "lemon");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Виведення списку після виникнення виняткової ситуації.
        System.out.println("B. Data: " + list);
    }
}
