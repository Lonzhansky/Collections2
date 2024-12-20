package demos._01_List._01_ArrayList._01_add;

import java.util.ArrayList;
import java.util.List;

// Метод add(int index, E element) всталяє елемент
// у вказану позицію (індекс) в списку.
public class Main03 {

    public static void main(String[] args) {
        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        // Додавання до певної позиції
        list.add(1, "mango");
        list.add("apple");
        // Виведення елементів
        System.out.println("Data: " + list);
    }
}
