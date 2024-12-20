package demos._01_List._02_LinkedList._02_addFirst;

import java.util.LinkedList;
import java.util.List;

// Метод addFirst(E e) вставляє вказаний елемент
// на початок списку.
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
        // Вставлення елементу
        list.addFirst("mango");
        // Виведення елементів
        System.out.println("2) Data: " + list);
    }
}
