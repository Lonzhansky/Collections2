package demos._01_List._01_ArrayList._04_contains;

import java.util.ArrayList;
import java.util.List;

// Метод contains(Object o)
// повертає true, якщо список містить
// вказаний елемент.
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до List
        list.add(23);
        list.add(17);
        list.add(5);
        list.add(38);
        // Виведення елементів
        System.out.println("Data: " + list);

        // Визначення чи містить список певний елемент.
        Integer item = 17;
        if (list.contains(item)) {
            System.out.println("Data contain " + item);
        } else {
            System.out.println("Data do not contain " + item);
        }
    }
}
