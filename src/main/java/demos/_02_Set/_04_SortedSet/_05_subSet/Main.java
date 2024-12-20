package demos._02_Set._04_SortedSet._05_subSet;

import java.util.SortedSet;
import java.util.TreeSet;

// Метод subSet(E fromElement, E toElement) повертає представлення
// частини набору, елементи якого варіюються від fromElement, включно,
// до toElement, виключно.
// Якщо fromElement та toElement рівні, повернутий набір буде порожнім.
// Викидає
// NullPointerException - якщо fromElement або toElement є null.
// IllegalArgumentException - якщо fromElement більше, ніж toElement.
public class Main {

    public static void main(String[] args) {
        // Створення набору через конструктор TreeSet
        SortedSet<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("mango");
        set.add("plum");
        set.add("cherry");
        set.add("apricot");
        set.add("orange");
        // Виведення елементів
        System.out.println("1) Data: " + set);

        // Отримаємо певний діапазон набору
        SortedSet<String> set1 = set.subSet("cherry", "orange");
        // Виведення елементів
        System.out.println("2) Data: " + set1);

        // Намагаємося отримати певний діапазон набору,
        // коли fromElement та toElement рівні
        set1 = set.subSet("cherry", "cherry");
        // Виведення елементів
        System.out.println("3) Data: " + set1);

        // Намагаємося отримати певний діапазон набору,
        // коли toElement є null. Маємо обробити виняток.
        try {
            set1 = set.subSet("cherry", null);
            // Виведення елементів
            System.out.println("4) Data: " + set1);
        } catch (NullPointerException e) {
            System.out.println("No data! NullPointerException.");
        }

        // Намагаємося отримати діапазон, коли
        // fromElement більше, ніж toElement.
        // Маємо обробити виняток.
        try {
            set1 = set.subSet("orange", "cherry");
            System.out.println("5) Data: " + set1);
        } catch (IllegalArgumentException e) {
            System.out.println("No data! IllegalArgumentException.");
        }
    }
}
