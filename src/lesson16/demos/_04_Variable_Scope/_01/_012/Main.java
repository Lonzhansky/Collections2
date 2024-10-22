package lesson16.demos._04_Variable_Scope._01._012;

public class Main {

    static Calculator calculator;
    static double res;
    static double a;
    static double b;

    public static void main(String[] args) {

        a = 4;
        b = 12;

        // NO ERROR: Variable 'a' is already defined in the scope
        // Змінна задекларована за межами main()
        calculator = (a, b) -> a + b;
        res = calculator.calcResult(a, b);
        System.out.println("Result is " + res);
    }
}
