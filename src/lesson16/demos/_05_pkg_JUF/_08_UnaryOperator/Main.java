package lesson16.demos._05_pkg_JUF._08_UnaryOperator;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        UnaryOperator<Integer> square = x -> x * x;
        int result = square.apply(5); // Результат буде 25
        System.out.println(result);

    }
}
