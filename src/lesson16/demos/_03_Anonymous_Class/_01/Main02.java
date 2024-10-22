package lesson16.demos._03_Anonymous_Class._01;


public class Main02 {

    static Calculator calculator;
    static double res;
    static double a;
    static double b;

    public static void main(String[] args) {

        a = 4;
        b = 12;

        // Функціональний інтерфейс можна реалізувати
        // як лямбда-вираз.
        // Компілятор Java може визначити тип
        // повертаємого значення
        calculator = (a, b) -> a + b;
        res = calculator.calcResult(a, b);
        System.out.println("Result is " + res);
    }
}
