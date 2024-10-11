package demos._01_List._01_ArrayList._14_sort;

import java.util.ArrayList;
// Interface Comparator<T>
// Функція порівняння, яка втановлює загальне впорядкування
// на деяку колекцію об’єктів.
// https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
import java.util.Comparator;
import java.util.List;

// Метод sort(Comparator<? super E> c) сортує
// список згідно компаратору.
public class Main01 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("grape");
        list.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Comparator.naturalOrder() повертає компаратор,
        // який порівнює порівнювані об’єкти (елементи списку)
        // в природному порядку.
        list.sort(Comparator.naturalOrder());
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Comparator.reverseOrder() повертає компаратор,
        // повертає компаратор, який встановлює порядок,
        // зворотний до природного.
        list.sort(Comparator.reverseOrder());
        // Виведення елементів
        System.out.println("3) Data: " + list);
    }
}
