package demos._02_Set._01_HashSet._04_contains;

import java.util.HashSet;
import java.util.Set;

// Метод contains(Object o) повертає true,
// якщо набір містить вказаний елемент.
public class Main02 {

    public static void main(String[] args) {
        // Створення набору через конструктор HashSet
        Set<Integer> set = new HashSet<>();
        // Додавання елементів до набору
        set.add(23);
        set.add(17);
        set.add(35);
        set.add(8);
        // Виведення елементів
        System.out.println("Data: " + set);

        // Визначення чи містить набір певний елемент.
        Integer item = 17;
        if (set.contains(item)) {
            System.out.println("Data contain " + item);
        } else {
            System.out.println("Data do not contain " + item);
        }
    }
}
