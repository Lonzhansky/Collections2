package lesson16.demos._02_methods_ref._06;

// Лямбда-вираз із кількома параметрами
public class Main {

    static NumsHandler numsHandler;
    static DataHandler dataHandler;
    static double a;
    static int b;
    static String str;
    static double res;
    static String res1;

    public static void main(String[] args) {

        // Декілька параметрів із типом даних
        // у лямбда-виразі
        a = 36;
        b = 24;
        numsHandler = Double::sum;
        res = numsHandler.handleNums(a, b);
        System.out.println("1) Result is " + res);

        // Декілька параметрів без типу даних
        // у лямбда-виразі
        a = 15;
        b = 23;
        numsHandler = (a, b) -> (a - b);
        res = numsHandler.handleNums(a, b);
        System.out.println("2) Result is " + res);

        a = 45;
        str = "ABC";
        dataHandler = (str, a) -> (str + " " + a);
        res1 = dataHandler.printData(str, a);
        System.out.println("3) Result is " + res1);
    }
}
