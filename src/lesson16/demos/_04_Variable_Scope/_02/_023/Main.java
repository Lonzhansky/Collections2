package lesson16.demos._04_Variable_Scope._02._023;

// Застосування зовнішніх змінних.
// Розподіл функціоналу за методами.
// Деяке вирішення проблеми з локальними змінними.
public class Main {

    static double a;
    static double b;
    static double res;

    public static void main(String[] args) {
        getData();
        getOutput(getRes());
    }

    private static void getData() {
        a = 6;
        b = 2;
    }

    private static Calculator handleNums() {
        return (x, y) -> {
            res = x + y;
            return res;
        };
    }

    // Або простіше
//    private static Calculator handleNums() {
//        return (x, y) -> x + y;
//    }

    private static double getRes() {
        return handleNums().calcResult(a, b);
    }

    private static void getOutput(double res) {
        System.out.println("Result is " + res);
    }
}
