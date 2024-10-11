package demos._02_Set._05_NavigableSet._03_floor;

import java.util.NavigableSet;
import java.util.TreeSet;

// Метод floor(E e) повертає найбільший елемент
// у наборі, менший або рівний даному елементу,
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
        String item = set.floor("mango");
        System.out.println("Item is " + item);

        // Вказуємо елемент, якого немає в наборі,
        // але він в межах елементів набору.
        // Тобто, avocado є між apricot та plum.
        // Маємо отримати з набору найближчий знизу
        // елемент до цього елементу. Тут - apricot.
        String item1 = set.floor("avocado");
        System.out.println("Item1 is " + item1);

        // Вказуємо елемент, якого немає в наборі
        // та він за межами набору (potato більше
        // ніж plum). Маємо отримати елемент, який
        // нижче і є в наборі. Тут - plum.
        String item2 = set.floor("potato");
        System.out.println("Item2 is " + item2);

        // Вказуємо елемент як null.
        // Маємо обробити виняток.
        try {
            String item3 = set.floor(null);
            System.out.println("Item3 is " + item3);
        } catch (NullPointerException e) {
            System.out.println("No data!");
        }

    }
}
