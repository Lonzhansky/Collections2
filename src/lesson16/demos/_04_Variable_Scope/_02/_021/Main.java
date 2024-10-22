package lesson16.demos._04_Variable_Scope._02._021;

public class Main {

    static double a;
    static double b;

    public static void main(String[] args) {

        a = 6;
        b = 2;

        double res;

//        Calculator calculator = (x, y) -> {
//            // ERROR: Variable used in lambda expression
//            // should be final or effectively final
//            res = x + y;
//            return res;
//        };
//
//        res = calculator.calcResult(a, b);
//
//        System.out.println("Result is " + res);
    }
}
