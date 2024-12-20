package lesson16.demos._05_pkg_JUF._05_BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

// У BiFunction andThen() викликається
// з Function як аргументом.
// Коли метод apply() викликається для BiFunction,
// він спочатку виконує реалізацію BiFunction,
// а потім реалізацію Function.
public class Main03 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction =
                (a, b) -> a + b;

        Function<Integer, Integer> function =
                a -> a * a;

        System.out.println("Result is " +
                biFunction.andThen(function).apply(2, 4));
    }
}
