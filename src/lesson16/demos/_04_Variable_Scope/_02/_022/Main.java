package lesson16.demos._04_Variable_Scope._02._022;

public class Main {

    static double a;
    static double b;

    public static void main(String[] args) {

        a = 6;
        b = 2;

        // Щоб обійти обмеження на локальні змінні,
        // можна використовувати тримач змінних для
        // зміни значення локальної змінної.
        // Однак це може призвести до непередбачуваних результатів.
        // Чи отримуємо доступ до цього елемента масиву спершу,
        // чи лямбда спершу робить дії?
        // Чи лямбда виконує дії саме над цим елементом масиву?
        final double[] res = new double[1];

        Calculator calculator = (x, y) -> {
            // NO ERROR: Variable used in lambda expression
            // should be final or effectively final
            res[0] = x + y;
            return res[0];
        };

        res[0] = calculator.calcResult(a, b);

        System.out.println("Result is " + res[0]);
    }
}
