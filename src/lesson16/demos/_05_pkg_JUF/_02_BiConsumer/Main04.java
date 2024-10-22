package lesson16.demos._05_pkg_JUF._02_BiConsumer;

import java.util.function.BiConsumer;

// default метод andThen(), в інтерфейсі BiConsumer,
// приймає інший BiConsumer як аргумент
// і повертає складовий BiConsumer, який
// послідовно виконує спочатку операцію
// викликаючого BiConsumer, а потім операцію після.
public class Main04 {

    public static void main(String[] args) {

        int c = 3;
        int d = 5;

        BiConsumer<Integer, Integer> biConsumerAdd = (a, b) ->
                System.out.println("Sum is " + (a + b));

        BiConsumer<Integer, Integer> biConsumerMul = (a, b) ->
                System.out.println("Multiplication is " + (a * b));

        // Спершу додавання, потім множення
        biConsumerAdd.andThen(biConsumerMul).accept(c, d);
    }
}
