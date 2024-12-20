package demos._01_List._01_ArrayList._01_add;

import java.util.ArrayList;
import java.util.List;

// Метод add(E e) додає елемент у кінець списку.
public class Main01 {

    public static void main(String[] args) {
        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("banana");
        list.add(null); // <- null дозволено
        list.add("kiwi");
        list.add("banana"); // <- Дублікат дозволено
        list.add("apple");
        // Виведення елементів
        System.out.println("Data: " + list);
    }
}