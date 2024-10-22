package lesson16.demos._05_pkg_JUF._06_Predicate;

import java.util.ArrayList;
import java.util.List;

// Метод removeIf(Predicate<? super E> filter) видаляє
// всі елементи колекції, які задовольняють заданий предикат.
public class Main07 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("orange");
        list1.add("apple");
        list1.add("banana");
        list1.add("mango");
        list1.add("banana");
        list1.add("kiwi");
        // Виведення списку
        System.out.println("1) Data: " + list1);

        // Фільтруємо список через видалення певного значення
        list1.removeIf(name -> name.equals("banana"));
        // Виведення списку
        System.out.println("2) Data: " + list1);

        // Фільтруємо список через видалення певного значення,
        // якого немає
        list1.removeIf(name -> name.equals("grape"));
        // Виведення списку
        System.out.println("3) Data: " + list1);

    }
}
