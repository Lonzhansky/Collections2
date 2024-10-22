package lesson16.demos._04_Variable_Scope._01._011;


public class Main {

    static Calculator calculator;
    static double res;
    static double b;

    public static void main(String[] args) {

        double a = 4;
        b = 12;

        // ERROR: Variable 'a' is already defined in the scope
//        calculator = (a, b) -> a + b;
        res = calculator.calcResult(a, b);
        System.out.println("Result is " + res);
    }
}
