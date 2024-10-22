package lesson16.demos._05_pkg_JUF._06_Predicate;

import java.util.function.Predicate;

// Перевіряємо певну умову через test()
public class Main01 {

    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> i > 5;

        boolean isCondition = predicate.test(3);
        System.out.println("Result is " + isCondition);

        isCondition = predicate.test(10);
        System.out.println("Result is " + isCondition);
    }
}
