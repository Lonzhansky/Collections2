package demos._02_Set._04_SortedSet._06_tailSet;

import java.util.SortedSet;
import java.util.TreeSet;

// Метод tailSet(E fromElement) повертає представлення
// частини набору, елементи якого більше або дорівнюють fromElement.
// Викидає NullPointerException - якщо fromElement є null.
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
        SortedSet<String> set1 = set.tailSet("mango");
        // Виведення елементів
        System.out.println("2) Data: " + set1);

        // Намагаємося отримати діапазон з null елементу.
        // Маємо обробити виняток.
        try {
            set1 = set.tailSet(null);
            System.out.println("3) Data: " + set1);
        } catch (NullPointerException e) {
            System.out.println("No data!");
        }
    }
}
