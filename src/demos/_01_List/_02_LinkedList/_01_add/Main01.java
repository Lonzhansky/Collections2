package demos._01_List._02_LinkedList._01_add;

import java.util.LinkedList;
import java.util.List;

// Метод add(E e) додає елемент у кінець списку.
public class Main01 {

    public static void main(String[] args) {

        // Створення List через конструктор LinkedList
        List<String> list = new LinkedList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add(null); // <- null дозволено
        list.add("banana"); // <- Дублікат дозволено
        list.add("apple");
        // Виведення елементів
        System.out.println("Data: " + list);
    }
}
