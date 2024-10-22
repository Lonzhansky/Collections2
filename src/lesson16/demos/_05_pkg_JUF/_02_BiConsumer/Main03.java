package lesson16.demos._05_pkg_JUF._02_BiConsumer;

import java.util.function.BiConsumer;

// Математичні операції
public class Main03 {

    static double a;
    static double b;

    public static void main(String[] args) {

        a = 2.5;
        b = 3.0;

        BiConsumer<Double, Double> biConsumer1 = (a, b) ->
                System.out.println("Sum is " + (a + b));

        BiConsumer<Double, Double> biConsumer2 = (a, b) ->
                System.out.println("Multiplication is " + (a * b));

        biConsumer1.accept(a, b);
        biConsumer2.accept(a, b);
    }
}
