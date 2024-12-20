package lesson16.demos._05_pkg_JUF._04_Function._01;

import java.util.function.Function;

// Розрахунок квадрата числа
public class Main02 {

    public static void main(String[] args) {
        double result = square(9);
        System.out.println("Square is " + result);
    }

    public static double square(double a) {
        Function<Double, Double> function = x -> x * x;
        return function.apply(a);
    }
}
