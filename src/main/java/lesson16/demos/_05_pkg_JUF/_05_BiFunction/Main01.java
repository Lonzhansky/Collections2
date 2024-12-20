package lesson16.demos._05_pkg_JUF._05_BiFunction;

import java.util.function.BiFunction;

// Функція приймає два рядки як аргументи
// і повертає об'єднаний рядок як результат.
public class Main01 {

    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction =
                (str1, str2) -> str1 + " " + str2;

        System.out.println("Result: " +
                biFunction.apply("Orange", "is tasty"));
    }
}
