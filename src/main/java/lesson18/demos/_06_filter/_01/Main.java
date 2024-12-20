package lesson18.demos._06_filter._01;

import java.util.Optional;

// Optional значення фільтруються за допомогою filter(),
// який приймає лямбда-вираз типу Predicate, який зберігатиме
// відповідну перевірку.
// https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
// Якщо умова предикату відповідає числу (тобто повертає істину),
// тоді повертається відповідне значення, загорнуте в Optional,
// інакше повертається порожній Optional.
public class Main {

    public static void main(String[] args) {

        Optional<Integer> optional = Optional.of(27);

        // Фільтрація парного числа
        System.out.println(optional.filter(x -> x % 2 == 0));

        // Фільтрація непарного числа
        System.out.println(optional.filter(x -> x % 2 == 1));
    }
}
