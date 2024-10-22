package lesson16.demos._05_pkg_JUF._01_Consumer._01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Функціональний інтерфейс Consumer використовується в JDK.
// Наприклад, метод forEach() приймає Consumer як аргумент.
public class Main03 {

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("orange", "mango", "plum", "kiwi");

        AtomicInteger count = new AtomicInteger(1);

        // public void forEach(java.util.function.Consumer<? super T> action)
        list.forEach(element ->
                System.out.println(count.getAndIncrement() +
                        ") " + element)
        );
    }
}
