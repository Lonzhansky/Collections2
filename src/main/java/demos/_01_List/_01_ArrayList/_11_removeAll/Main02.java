package demos._01_List._01_ArrayList._11_removeAll;

import java.util.ArrayList;
import java.util.List;

// Метод removeAll(Collection<?> c) видаляє
// зі списку всі його елементи, які містяться
// у вказаній колекції.
public class Main02 {

    public static void main(String[] args) {

        // Створення списку 1 через конструктор ArrayList
        List<Integer> list1 = new ArrayList<>();
        // Додавання елементів до списку 1
        list1.add(23);
        list1.add(17);
        list1.add(35);
        list1.add(19);
        list1.add(8);
        // Виведення елементів списку 1
        System.out.println("1) Data: " + list1);

        // Створення списку 2 через конструктор ArrayList
        List<Integer> list2 = new ArrayList<>();
        // Додавання елементів до списку 2
        list2.add(17);
        list2.add(19);
        // Виведення елементів списку 2
        System.out.println("2) Data: " + list2);

        // Видалення елементів списку 1 за списком 2
        list1.removeAll(list2);
        // Виведення елементів оновленого списку 1
        System.out.println("3) Data: " + list1);

    }
}
