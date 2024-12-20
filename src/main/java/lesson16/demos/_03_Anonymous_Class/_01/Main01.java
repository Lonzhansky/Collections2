package lesson16.demos._03_Anonymous_Class._01;


public class Main01 {

    static Calculator calculator;
    static double res;
    static double a;
    static double b;

    public static void main(String[] args) {

        a = 5;
        b = 2;

        // Коли реалізуємо функціональний інтерфейс,
        // можемо реалізувати його як анонімний клас.
        // АЛЕ отримуємо попередження про заміну на лямбду.
        calculator = new Calculator() {
            @Override
            public double calcResult(double a, double b) {
                return a + b;
            }
        }; // <- наявність ; !!!

        res = calculator.calcResult(a, b);
        System.out.println("Result is " + res);
    }
}
