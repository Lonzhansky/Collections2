package demos._01_List._01_ArrayList._01_add;

import java.util.ArrayList;
import java.util.List;

// Метод add(E e) додає елемент у кінець списку.
public class Main02 {

    public static void main(String[] args) {
        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до List
        list.add(25);
        list.add(17);
        list.add(null); // <- null дозволено
        list.add(98);
        list.add(25); // <- Дублікат дозволено
        list.add(5);
        // Виведення елементів
        System.out.println("Data: " + list);
    }
}
