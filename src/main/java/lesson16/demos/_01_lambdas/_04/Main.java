package lesson16.demos._01_lambdas._04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Лямбда з колекцією та циклом
public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alice");
        names.add("Lucy");
        names.add("Robert");
        names.add("Samanta");

        AtomicInteger count = new AtomicInteger(0);
        names.forEach(
                // лямбда
                name -> System.out.println(
                        count.incrementAndGet()
                        + ") Name is " + name)
        );
    }
}
