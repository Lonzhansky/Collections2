package lesson16.demos._03_Anonymous_Class._01;


public class Main03 {

    static Calculator calculator;
    static double res;
    static double a;
    static double b;

    public static void main(String[] args) {

        a = 4;
        b = 12;

        // Використання посилання на метод
        calculator = Double::sum;
        res = calculator.calcResult(a, b);
        System.out.println("Result is " + res);
    }
}
