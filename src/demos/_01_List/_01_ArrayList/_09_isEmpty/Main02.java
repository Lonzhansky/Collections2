package demos._01_List._01_ArrayList._09_isEmpty;

import java.util.ArrayList;
import java.util.List;

// Метод isEmpty()
// повертає true, якщо список не містить елементів.
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();

        // Виведення порожнього списку
        System.out.println("1) Data: " + list);

        // Визначення чи містить список елементи.
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is full");
        }

        // Додавання елементів до списку
        list.add(23);
        list.add(17);
        list.add(5);
        list.add(38);

        // Виведення повного списку
        System.out.println("2) Data: " + list);

        // Визначення чи містить список елементи.
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is full");
        }
    }
}
