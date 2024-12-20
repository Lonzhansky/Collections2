package demos._01_List._02_LinkedList._04_getFirst;

import java.util.LinkedList;
import java.util.List;

// Метод getFirst() повертає перший елемент списку.
public class Main02 {

    public static void main(String[] args) {
        // Створення списку через конструктор LinkedList
        List<Integer> list = new LinkedList<>();
        // Додавання елементів до списку
        list.add(25);
        list.add(17);
        list.add(98);
        list.add(5);
        // Виведення елементів
        System.out.println("Data: " + list);
        // Повернення елементу
        Integer item = list.getFirst();
        // Виведення елементу
        System.out.println("Item: " + item);
    }
}
