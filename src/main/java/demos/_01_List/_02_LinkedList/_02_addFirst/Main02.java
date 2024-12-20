package demos._01_List._02_LinkedList._02_addFirst;

import java.util.LinkedList;
import java.util.List;

// Метод addFirst(E e) вставляє вказаний елемент
// на початок списку.
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
        // Вставлення елементу
        list.addFirst(39);
        // Виведення елементів
        System.out.println("2) Data: " + list);
    }
}
