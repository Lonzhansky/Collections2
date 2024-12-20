package demos._02_Set._05_NavigableSet._05_lower;

import java.util.NavigableSet;
import java.util.TreeSet;

// Метод lower(E e) повертає найбільший елемент у наборі,
// суворо менший за вказаний елемент, або null, якщо такого
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
        // та нижче нього є елементи.
        // Тут, найближчим знизу до mango є cherry.
        String item = set.lower("mango");
        System.out.println("Item is " + item);

        // Вказуємо елемент, який є в наборі
        // та нижче нього немає елементів.
        // Тому результатом буде null.
        String item1 = set.lower("apricot");
        System.out.println("Item1 is " + item1);

        // Вказуємо елемент, якого немає в наборі,
        // але він в межах елементів набору.
        // Тобто, avocado є між apricot та plum.
        // Маємо отримати з набору найближчий знизу
        // елемент до цього елементу. Тут - apricot.
        String item2 = set.lower("avocado");
        System.out.println("Item2 is " + item2);

        // Вказуємо елемент, якого немає в наборі
        // та він за межами набору (potato більше
        // ніж plum). Маємо отримати plum який
        // найближчий знизу від potato. Тут - plum.
        String item3 = set.lower("potato");
        System.out.println("Item3 is " + item3);

        // Вказуємо елемент як null.
        // Маємо обробити виняток.
        try {
            String item4 = set.lower(null);
            System.out.println("Item4 is " + item4);
        } catch (NullPointerException e) {
            System.out.println("No data!");
        }

    }
}
