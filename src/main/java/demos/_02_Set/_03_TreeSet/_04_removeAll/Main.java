package demos._02_Set._03_TreeSet._04_removeAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Метод removeAll(Collection<?> c) видаляє з набору
// всі його елементи, які містяться у вказаній колекції.
public class Main {

    public static void main(String[] args) {

        // Створення набору
        Set<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add("kiwi");
        set.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + set);

        // Створення списку
        List<String> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add("mango");
        list.add("kiwi");
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Видалення з набору елементів, які є в списку
        set.removeAll(list);
        // Виведення елементів
        System.out.println("3) Data: " + set);
    }
}
