package demos._01_List._02_LinkedList._04_getFirst;

import java.util.LinkedList;
import java.util.List;

// Метод getFirst() повертає перший елемент списку.
public class Main01 {

    public static void main(String[] args) {
        // Створення списку через конструктор LinkedList
        List<String> list = new LinkedList<>();
        // Додавання елементів до списку
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("apple");
        // Виведення елементів
        System.out.println("Data: " + list);
        // Повернення елементу
        String item = list.getFirst();
        // Виведення елементу
        System.out.println("Item: " + item);
    }
}
