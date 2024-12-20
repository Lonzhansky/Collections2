package lesson16.demos._05_pkg_JUF._09_BinaryOperator;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        int result = sum.apply(5, 10); // Результат буде 15
        System.out.println(result);

    }
}
