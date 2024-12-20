package demos._01_List._02_LinkedList._03_addLast;

import java.util.LinkedList;
import java.util.List;

// Метод addLast(E e) додає вказаний елемент
// у кінець списку.
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
        System.out.println("1) Data: " + list);
        // Додавання елементу
        list.addLast("mango");
        // Виведення елементів
        System.out.println("2) Data: " + list);
    }
}
