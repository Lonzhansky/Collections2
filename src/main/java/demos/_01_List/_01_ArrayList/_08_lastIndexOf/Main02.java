package demos._01_List._01_ArrayList._08_lastIndexOf;

import java.util.ArrayList;
import java.util.List;

// Метод lastIndexOf(Object o) повертає індекс
// останнього входження зазначеного елемента
// в списку або -1, якщо список не містить елемент.
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до List
        list.add(25);
        list.add(17); // <- Входження 1 (індекс 1)
        list.add(23);
        list.add(17); // <- Входження 2 (індекс 3)
        list.add(98);
        list.add(5);

        // Виведення елементів
        System.out.println("Data: " + list);
        // Отримання індексу останнього входження
        // зазначеного елемента зі списку
        int index = list.lastIndexOf(17);
        // Виведення індексу
        System.out.println("Index is " + index);
    }
}
