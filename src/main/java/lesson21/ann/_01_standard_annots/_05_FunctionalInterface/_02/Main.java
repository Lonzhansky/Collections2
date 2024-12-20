package lesson21.ann._01_standard_annots._05_FunctionalInterface._02;

// Функціональні інтерфейси можуть бути
// реалізовані за допомогою лямбда-виразу.
public class Main {

    static int a;
    static int res;

    public static void main(String[] args) {

        // Лямбда-вираз для визначення методу інтерфейсу
        SquareUtil squareUtil = (int x) -> x * x;

        a = 5;
        // переданий параметр та тип значення, що повертається
        // повинні бути те саме, що визначено в прототипі
        res = squareUtil.calcSquare(a);

        System.out.println("Result is " + res);
    }
}
