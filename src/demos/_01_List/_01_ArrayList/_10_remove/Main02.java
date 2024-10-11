package demos._01_List._01_ArrayList._10_remove;

import java.util.ArrayList;
import java.util.List;

// Метод remove(int index) видаляє елемент
// у вказаній позиції (індексом) в списку.
// Метод remove(Object o) видаляє перше входження
// зазначеного елемента зі списку, якщо він присутній.
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add(23);
        list.add(17); // <- Входження 1
        list.add(8);
        list.add(34);
        list.add(17); // <- Входження 2
        list.add(12);
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Видалення за індексом
        list.remove(2);
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Видалення за першим входженням елементу
        list.remove(Integer.valueOf(17));
        // Виведення елементів
        System.out.println("3) Data: " + list);

        // Видалення за першим (воно ж і єдине) входженням елементу
        list.remove(Integer.valueOf(23));
        // Виведення елементів
        System.out.println("4) Data: " + list);

        // Видалення елементу, якого немає.
        // Нічого не відбувається.
        list.remove(Integer.valueOf(38));
        // Виведення елементів
        System.out.println("5) Data: " + list);

        // Видалення за індексом, якого немає.
        // Маємо обробити виняток.
        try {
            list.remove(9);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Виведення елементів
        System.out.println("6) Data: " + list);
    }
}
