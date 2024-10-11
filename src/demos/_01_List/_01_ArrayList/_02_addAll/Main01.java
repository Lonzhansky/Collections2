package demos._01_List._01_ArrayList._02_addAll;

import java.util.ArrayList;
import java.util.List;

// Метод addAll(Collection<? extends E> c)
// вставляє всі елементи одного списку в кінець іншого.
// Метод addAll(int index, Collection<? extends E> c)
// вставляє всі елементи одного списку в інший список,
// починаючи з указаної позиції (індексу).
public class Main01 {

    public static void main(String[] args) {

        // Список 1.
        List<String> list1 = new ArrayList<>();
        // Виведення списку 1. Має бути порожнім.
        System.out.println("1) Data: " + list1);

        // Додавання даних у список 1.
        list1.add("orange");
        list1.add("kiwi");
        list1.add("banana");
        list1.add("apple");
        // Виведення списку 1 після додання даних.
        System.out.println("2) Data: " + list1);

        // Додаємо у список 1 дані за певною позицією.
        list1.add(2, "mango");
        // Виведення списку 1 після додання даних за позицією.
        System.out.println("3) Data: " + list1);

        // Список 2.
        List<String> list2 = new ArrayList<>();
        // Додавання даних у список 2.
        list2.add("tomato");
        list2.add("potato");

        // Додаємо список 2 у список 1.
        list1.addAll(list2);
        // Виведення списку 1 після додання списку 2.
        System.out.println("4) Data: " + list1);

        // Список 3
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("milk");
        list3.add("cheese");

        // Додаємо список 3 в попередньо модифікований
        // список 1 за певним індексом.
        list1.addAll(1, list3);
        // Виведення списку 1 після додання списку 3.
        System.out.println("5) Data: " + list1);

    }
}
