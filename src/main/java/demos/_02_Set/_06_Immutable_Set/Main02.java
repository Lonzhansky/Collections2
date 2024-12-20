package demos._02_Set._06_Immutable_Set;

import java.util.Set;

// Починаючи з Java 9, через статичний метод
// Set.of(elements) можна створити незмінний набір.
// Цей метод повертає незмінний набір, який може містити
// певну кількість елементів.
public class Main02 {

    public static void main(String[] args) {

        Set<String> set = Set.of("orange", "mango", "kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + set);

        // Намагаємося модифікувати незмінний набір.
        // Маємо обробити виняток.
        try {
            set.add("apricot");
            System.out.println("2) Data: " + set);
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Виведення елементів. Без змін.
        System.out.println("3) Data: " + set);
    }
}
