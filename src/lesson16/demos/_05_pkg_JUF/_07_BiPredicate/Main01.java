package lesson16.demos._05_pkg_JUF._07_BiPredicate;

import java.util.function.BiPredicate;

// Тут, лямбда-вираз інтерфейсу BiPredicate.
// Коли викликається метод test() з двома аргументами,
// Java може зробити висновок із контексту, що лямбда-вираз
// є реалізацією методу test().
public class Main01 {

    public static void main(String[] args) {

        BiPredicate<String, String> biPredicate =
                (str1, str2) -> str1.equals(str2);

        boolean isCondition = biPredicate.test("orange", "orange");
        System.out.println("Result is " + isCondition);

        isCondition = biPredicate.test("plum", "mango");
        System.out.println("Result is " + isCondition);
    }
}
