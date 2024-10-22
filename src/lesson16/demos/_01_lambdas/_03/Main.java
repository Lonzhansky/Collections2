package lesson16.demos._01_lambdas._03;

// Лямбда-вираз із кількома параметрами
public class Main {

    static NumsHandler numsHandler;
    static int a;
    static int b;
    static int res;

    public static void main(String[] args) {

        // Декілька параметрів із типом даних
        // у лямбда-виразі
        a = 36;
        b = 24;
        numsHandler = (int a, int b) -> (a + b);
        res = numsHandler.handleNums(a, b);
        System.out.println("1) Result is " + res);

        // Декілька параметрів без типу даних
        // у лямбда-виразі
        a = 15;
        b = 23;
        numsHandler = (a, b) -> (a - b);
        res = numsHandler.handleNums(a, b);
        System.out.println("2) Result is " + res);

    }
}
