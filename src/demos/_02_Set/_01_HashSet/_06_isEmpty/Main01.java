package demos._02_Set._01_HashSet._06_isEmpty;

import java.util.HashSet;
import java.util.Set;

// Метод isEmpty()
// повертає true, якщо набір не містить елементів.
public class Main01 {

    public static void main(String[] args) {

        // Створення набору через конструктор HashSet
        Set<String> set = new HashSet<>();
        // Виведення порожнього набору
        System.out.println("1) Data: " + set);

        // Визначення чи містить набір елементи.
        if (set.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is full");
        }

        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add("kiwi");
        set.add("apple");
        // Виведення наповненого набору
        System.out.println("2) Data: " + set);

        // Визначення чи містить набір елементи.
        if (set.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is full");
        }
    }
}
