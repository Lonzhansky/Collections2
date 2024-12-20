package demos._02_Set._04_SortedSet._03_last;

import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.TreeSet;

// Метод last() повертає останній (найвищий) елемент у наборі.
// Викидає NoSuchElementException - якщо набір порожній.
public class Main {

    public static void main(String[] args) {
        // Створення набору через конструктор TreeSet
        SortedSet<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("mango");
        set.add("plum");
        set.add("cherry");
        set.add("apricot");
        // Виведення елементів
        System.out.println("1) Data: " + set);

        // Отримаємо останній (найвищий) елемент у наборі.
        String item = set.last();
        System.out.println("Result is " + item);

        // Очистемо набір через clear()
        set.clear();
        // Виведення елементів
        System.out.println("2) Data: " + set);
        // Намагаємося отримати останній (найвищий)
        // елемент у наборі. Маємо обробити виняток.
        try {
            String item1 = set.last();
            System.out.println("Result is " + item1);
        } catch (NoSuchElementException e) {
            System.out.println("No data!");
        }
    }
}
