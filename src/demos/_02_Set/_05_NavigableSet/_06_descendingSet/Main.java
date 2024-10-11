package demos._02_Set._05_NavigableSet._06_descendingSet;

import java.util.NavigableSet;
import java.util.TreeSet;

// Метод descendingSet() повертає представлення
// у зворотному порядку елементів, що містяться
// в наборі.
public class Main {

    public static void main(String[] args) {
        // Створення набору через конструктор TreeSet
        NavigableSet<String> set = new TreeSet<>();
        // Додавання елементів до набору
        set.add("mango");
        set.add("plum");
        set.add("cherry");
        set.add("apricot");
        System.out.println("1) Data: " + set);

        NavigableSet<String> set1 = set.descendingSet();
        System.out.println("2) Data: " + set1);
    }
}
