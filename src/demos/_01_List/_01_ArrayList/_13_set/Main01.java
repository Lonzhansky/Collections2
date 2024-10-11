package demos._01_List._01_ArrayList._13_set;

import java.util.ArrayList;
import java.util.List;

// Метод set(int index, E element) замінює
// елемент у вказаній позиції (індексу) в списку
// вказаним елементом.
public class Main01 {

    public static void main(String[] args) {

        // Створення списку через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Заміна елементу за індексом
        list.set(2, "mango");
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Заміна елементу за індексом, якого немає.
        // Маємо обробити виняток.
        try {
            list.set(9, "grape");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Виведення елементів
        System.out.println("3) Data: " + list);
    }
}
