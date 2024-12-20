package lesson16.demos._05_pkg_JUF._06_Predicate;

import java.util.function.Predicate;

// Перевіряємо чи починається переданий рядок
// з літери "A" або "P".
// Використовуємо метод or() інтерфейсу Predicate
// задля реалізації цієї логіки.
public class Main04 {

    public static void main(String[] args) {

        Predicate<String> predicate1 =
                str -> str.toUpperCase().startsWith("A");

        Predicate<String> predicate2 =
                predicate1.or(str ->
                        str.toUpperCase().startsWith("P"));

        boolean isCondition = predicate2.test("apple");
        System.out.println("Result is " + isCondition);

        isCondition = predicate2.test("orange");
        System.out.println("Result is " + isCondition);

        isCondition = predicate2.test("Plum");
        System.out.println("Result is " + isCondition);
    }
}
