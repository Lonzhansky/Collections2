package lesson16.demos._05_pkg_JUF._06_Predicate;

import java.util.function.Predicate;

// Перевірка діапазону, що передане число
// більше a, але менше b.
// Робимо з допомогою методу and() інтерфейсу Predicate,
// створивши два предикати і скомпонувавши їх за допомогою
// and() так, що спочатку оцінюється стан більше a,
// а потім оцінюється стан менше b.
public class Main03 {

    static int a;
    static int b;

    public static void main(String[] args) {

        a = 5;
        b = 16;

        Predicate<Integer> predicate1 =
                i -> i > a;
        Predicate<Integer> predicate2 =
                predicate1.and(i -> i < b);

        boolean isCondition = predicate2.test(10);
        System.out.println("Result is " + isCondition);

        isCondition = predicate2.test(25);
        System.out.println("Result is " + isCondition);

        isCondition = predicate2.test(8);
        System.out.println("Result is " + isCondition);
    }
}
