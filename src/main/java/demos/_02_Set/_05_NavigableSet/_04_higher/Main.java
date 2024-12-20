package demos._02_Set._05_NavigableSet._04_higher;

import java.util.NavigableSet;
import java.util.TreeSet;

// Метод higher(E e) повертає найменший елемент у наборі,
// суворо більший за даний елемент, або null, якщо такого
// елемента немає.
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

        // Вказуємо елемент, який є в наборі
        // та вище нього є елементи.
        // Тут, найближчим зверху до mango є plum.
        String item = set.higher("mango");
        System.out.println("Item is " + item);

        // Вказуємо елемент, який є в наборі
        // та вище нього немає елементів.
        // Тому результатом буде null.
        String item1 = set.higher("plum");
        System.out.println("Item1 is " + item1);

        // Вказуємо елемент, якого немає в наборі,
        // але він в межах елементів набору.
        // Тобто, avocado є між apricot та plum.
        // Маємо отримати з набору найближчий зверху
        // елемент до цього елементу. Тут - cherry.
        String item2 = set.higher("avocado");
        System.out.println("Item2 is " + item2);

        // Вказуємо елемент, якого немає в наборі
        // та він за межами набору (potato більше
        // ніж plum). Маємо отримати null.
        String item3 = set.higher("potato");
        System.out.println("Item3 is " + item3);

        // Вказуємо елемент як null.
        // Маємо обробити виняток.
        try {
            String item4 = set.higher(null);
            System.out.println("Item4 is " + item4);
        } catch (NullPointerException e) {
            System.out.println("No data!");
        }

    }
}
