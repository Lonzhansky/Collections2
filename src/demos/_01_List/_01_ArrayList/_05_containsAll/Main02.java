package demos._01_List._01_ArrayList._05_containsAll;

import java.util.ArrayList;
import java.util.List;

// Метод containsAll(Collection<?> c)
// повертає true, якщо один список містить
// усі елементи іншої колекції.
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list1 = new ArrayList<>();
        // Додавання елементів до List
        list1.add(23);
        list1.add(17);
        list1.add(21);
        list1.add(9);
        list1.add(13);
        list1.add(34);
        // Виведення списку 1.
        System.out.println("1) Data: " + list1);

        // Створення List через конструктор ArrayList
        List<Integer> list2 = new ArrayList<>();
        // Додавання елементів до List
        list2.add(17);
        list2.add(9);
        list2.add(34);
        // Виведення списку 2.
        System.out.println("2) Data: " + list2);

        // Визначення чи містить список 1 елементи списку 2.
        if (list1.containsAll(list2)) {
            System.out.println("List contains list 2");
        } else {
            System.out.println("List does not contain list 2");
        }
    }
}
