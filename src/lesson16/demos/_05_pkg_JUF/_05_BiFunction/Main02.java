package lesson16.demos._05_pkg_JUF._05_BiFunction;

import java.util.function.BiFunction;

// Функція приймає два цілих числа як аргумент
// і повертає значення, рівне ступеню числа.
public class Main02 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Double> biFunction =
                (a1, a2) -> Math.pow(a1, a2);

        System.out.println("Result is " + biFunction.apply(5, 2));
    }
}
