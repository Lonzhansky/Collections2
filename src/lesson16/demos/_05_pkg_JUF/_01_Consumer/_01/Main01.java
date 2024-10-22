package lesson16.demos._05_pkg_JUF._01_Consumer._01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main01 {

    public static void main(String[] args) {

        // Цей оператор є реалізацією
        // Consumer як лямбда-виразу.
        // Оскільки реалізація є екземпляром
        // функціонального інтерфейсу, тому він
        // призначається змінній типу Consumer.
        Consumer<Integer> consumer = num ->
                System.out.println("Value is " + num);

        List<Integer> list = Arrays.asList(5, 4, 12, 8, 10);

        // Лямбда підтримує "цільову типізацію"
        // ("target typing"), яка виводить тип
        // об'єкта з контексту, в якому вона використовується.
        // Коли викликається метод Consumer.accept(),
        // Java може зробити висновок із контексту, де
        // шукати реалізацію методу accept().
        for (Integer num : list) {
            consumer.accept(num);
        }
    }
}
