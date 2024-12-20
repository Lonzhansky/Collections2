package lesson16.demos._05_pkg_JUF._06_Predicate;

import java.util.ArrayList;
import java.util.List;

// Метод removeIf(Predicate<? super E> filter) видаляє
// всі елементи колекції, які задовольняють заданий предикат.
public class Main06 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(24);
        list1.add(15);
        list1.add(16);
        list1.add(9);
        list1.add(28);
        // Виведення списку
        System.out.println("1) Data: " + list1);
        // Фільтруємо список через видалення непарних чисел
        list1.removeIf(num -> num % 2 != 0);
        // Виведення списку
        System.out.println("2) Data: " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(24);
        list2.add(15);
        list2.add(16);
        list2.add(9);
        list2.add(28);
        // Виведення списку
        System.out.println("3) Data: " + list2);
        // Фільтруємо список через видалення парних чисел
        list2.removeIf(num -> num % 2 == 0);
        // Виведення списку
        System.out.println("4) Data: " + list2);

    }
}
