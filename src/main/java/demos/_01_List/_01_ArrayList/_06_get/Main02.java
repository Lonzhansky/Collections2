package demos._01_List._01_ArrayList._06_get;

import java.util.ArrayList;
import java.util.List;

// Метод get(int index) повертає елемент
// у вказаній позиції (індексу) в списку.
// Викидає IndexOutOfBoundsException - якщо
// індекс виходить за межі діапазону індексів
// в списку.
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до List
        list.add(25);
        list.add(17);
        list.add(98);
        list.add(5);
        // Виведення елементів
        System.out.println("Data: " + list);

        // Отримання елементу з певної позиції в списку
        Integer item = list.get(2);
        // Виведення елементу
        System.out.println("Result is " + item);

        // Намагаємося отримати елемент за індексом, який
        // є за межами діапазону індексів.
        // Маємо обробити виняток.
        try {
            item = list.get(9);
            System.out.println("Result is " + item);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No data!");
        }
    }
}
