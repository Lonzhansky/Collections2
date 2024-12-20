package lesson16.demos._05_pkg_JUF._03_Supplier._01;

import java.util.function.Supplier;

// Генеруємо випадкове число
// через метод get() інтерфейсу Supplier.
public class Main {

    public static void main(String[] args) {

        int count = 0;
        Supplier<Double> randomRes = () -> Math.random();

        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println(count + ") result is " +
                    randomRes.get());
        }
    }
}
