package lesson16.demos._05_pkg_JUF._06_Predicate;

import java.util.function.Predicate;

// Перевіряємо чи починається переданий рядок
// з A чи ні.
// Якщо переданий рядок починається з будь-якої
// іншої літери, крім A, тоді можемо скасувати
// існуючий Predicate, щоб отримати Predicate,
// який може це перевірити.
public class Main05 {

    public static void main(String[] args) {

        Predicate<String> predicate1 =
                str -> str.toUpperCase().startsWith("A");

        Predicate<String> predicate2 = predicate1.negate();

        boolean isCondition = predicate2.test("apple");
        System.out.println("Result is " + isCondition);

        isCondition = predicate2.test("orange");
        System.out.println("Result is " + isCondition);

        isCondition = predicate2.test("Plum");
        System.out.println("Result is " + isCondition);
    }
}
