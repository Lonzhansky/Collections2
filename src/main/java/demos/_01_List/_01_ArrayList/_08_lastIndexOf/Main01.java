package demos._01_List._01_ArrayList._08_lastIndexOf;

import java.util.ArrayList;
import java.util.List;

// Метод lastIndexOf(Object o) повертає індекс
// останнього входження зазначеного елемента
// в списку або -1, якщо список не містить елемент.
public class Main01 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("mango");
        list.add("banana"); // <- Входження 1 (індекс 2)
        list.add("kiwi");
        list.add("banana"); // <- Входження 2 (індекс 4)
        list.add("apple");

        // Виведення елементів
        System.out.println("Data: " + list);
        // Отримання індексу останнього входження
        // зазначеного елемента зі списку
        int index = list.lastIndexOf("banana");
        // Виведення індексу
        System.out.println("Index is " + index);

    }
}
