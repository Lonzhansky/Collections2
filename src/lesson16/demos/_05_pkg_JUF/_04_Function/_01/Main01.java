package lesson16.demos._05_pkg_JUF._04_Function._01;

import java.util.function.Function;

// Розрахунок довжини рядка
public class Main01 {

    public static void main(String[] args) {

        Function<String, Integer> function = (str) -> str.length();

        System.out.println("String length is " +
                function.apply("orange"));

        System.out.println("String length is " +
                function.apply("Mango is very tasty"));
    }
}
