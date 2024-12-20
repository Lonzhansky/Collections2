package demos._02_Set._05_NavigableSet._02_ceiling;

import java.util.NavigableSet;
import java.util.TreeSet;

// Метод ceiling(E e) повертає найменший елемент
// у наборі, більший або рівний даному елементу,
// або null, якщо такого елемента немає.
// Викидає NullPointerException - якщо вказаний
// елемент має значення null.
public class Main {

    public static void main(String[] args) {
        // Створення набору через конструктор TreeSet
        NavigableSet<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("mango");
        set.add("plum");
        set.add("cherry");
        set.add("apricot");
        // Виведення елементів
        System.out.println("Data: " + set);

        // Вказуємо елемент, який є в наборі.
        String item = set.ceiling("mango");
        System.out.println("Item is " + item);

        // Вказуємо елемент, якого немає в наборі,
        // але він в межах елементів набору.
        // Тобто, avocado є між apricot та plum.
        // Маємо отримати з набору найближчий зверху
        // елемент до цього елементу. Тут - cherry.
        String item1 = set.ceiling("avocado");
        System.out.println("Item1 is " + item1);

        // Вказуємо елемент, якого немає в наборі
        // та він за межами набору (potato більше
        // ніж plum). Маємо отримати null.
        String item2 = set.ceiling("potato");
        System.out.println("Item2 is " + item2);

        // Вказуємо елемент як null.
        // Маємо обробити виняток.
        try {
            String item3 = set.ceiling(null);
            System.out.println("Item3 is " + item3);
        } catch (NullPointerException e) {
            System.out.println("No data!");
        }

    }
}
