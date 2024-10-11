package demos._01_List._02_LinkedList._03_addLast;

import java.util.LinkedList;
import java.util.List;

// Метод addLast(E e) додає вказаний елемент
// у кінець списку.
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
        System.out.println("1) Data: " + list);
        // Додавання елементу
        list.addLast(39);
        // Виведення елементів
        System.out.println("2) Data: " + list);
    }
}
