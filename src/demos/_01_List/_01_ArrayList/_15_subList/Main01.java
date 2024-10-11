package demos._01_List._01_ArrayList._15_subList;

import java.util.ArrayList;
import java.util.List;

// Метод subList(int fromIndex, int toIndex)
// повертає частину списку між вказаним fromIndex, включно,
// та toIndex, виключно.
// Якщо fromIndex та toIndex рівні, повернутий список порожній.
public class Main01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("apple");
        list.add("mango");

        // Виведення всіх елементів
        System.out.println("1) Data: " + list);

        // Виведення частини елементів.
        // fromIndex є 1, toIndex є 3.
        System.out.println("2) Data: " + list.subList(1, 3));

        // Виведення порожнього списку,
        // оскільки fromIndex та toIndex рівні.
        System.out.println("3) Data: " + list.subList(2, 2));

    }
}

