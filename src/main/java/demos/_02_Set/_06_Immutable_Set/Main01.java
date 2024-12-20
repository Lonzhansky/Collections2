package demos._02_Set._06_Immutable_Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Метод unmodifiableSet(Set<? extends T> s) повертає
// незмінний вигляд зазначеного набору.
// Цей метод дозволяє модулям надавати користувачам доступ
// «тільки для читання» до внутрішніх наборів.
// Операції запиту над повернутим набором "зчитуються" до зазначеного
// набору, а спроби змінити повернутий набір, прямо чи через його
// ітератор, призводять до UnsupportedOperationException.
public class Main01 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("mango");
        set.add("kiwi");
        // Перетворюємо набір у незмінний
        Set<String> unmodifiableSet =
                Collections.unmodifiableSet(set);
        // Виведення елементів
        System.out.println("1) Data: " + unmodifiableSet);

        // Намагаємося модифікувати незмінний набір.
        // Маємо обробити виняток.
        try {
            unmodifiableSet.add("apricot");
            System.out.println("2) Data: " + unmodifiableSet);
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Виведення елементів. Без змін.
        System.out.println("3) Data: " + unmodifiableSet);
    }
}
