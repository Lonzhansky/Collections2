package demos._01_List._01_ArrayList._04_contains;

import java.util.ArrayList;
import java.util.List;

// Метод contains(Object o)
// повертає true, якщо список містить
// вказаний елемент.
public class Main01 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("apple");
        // Виведення елементів
        System.out.println("Data: " + list);

        // Визначення чи містить список певний елемент.
        String item = "kiwi";
        if (list.contains(item)) {
            System.out.println("Data contain " + item);
        } else {
            System.out.println("Data do not contain " + item);
        }
    }
}
