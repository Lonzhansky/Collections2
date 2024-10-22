package lesson16.demos._05_pkg_JUF._01_Consumer._01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

// default метод andThen() приймає ще Consumer
// як аргумент і повертає складовий Consumer,
// який послідовно виконує спочатку операцію
// викликаючого Consumer, за якою слідує наступна
// операція.
public class Main02 {

    public static void main(String[] args) {

        // Перший Consumer
        Consumer<String> consumer1 = str ->
                System.out.print("Original " + str);

        // Додаємо ще Consumer через andThen()
        Consumer<String> consumer2 =
                consumer1.andThen(str ->
                        System.out.print(" modified to " +
                                str.toUpperCase() + "\n")
        );

        List<String> list =
                Arrays.asList("orange", "plum", "kiwi",
                        "lemon", "mango");

        AtomicInteger count = new AtomicInteger(1);

        for (String str : list) {
            // Лічильник вбудовуємо тут,
            // щоб був вивід для всього рядка
            // складового Consumer, а не всередині
            // рядка, для кожного окремого.
            System.out.print(count.getAndIncrement() + ") ");
            consumer2.accept(str);
            // Невірне рішення щодо нумерації виводу
//            consumer2.accept(count.getAndIncrement() + ") "
//                    + str);
        }
    }
}
