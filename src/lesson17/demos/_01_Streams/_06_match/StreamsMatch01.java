package lesson17.demos._01_Streams._06_match;

import java.util.List;
import java.util.function.Predicate;

// anyMatch() повертає значення true,
// якщо якісь елементи потоку відповідають предикату.
public class StreamsMatch01 {

    public static void main(String[] args) {

        Predicate<Employee> p1 =
                emp -> emp.getName().startsWith("S");

        Predicate<Employee> p2 =
                emp -> emp.getAge() < 28 & emp.getName().startsWith("M");

        List<Employee> list = new DataRepository().getData();

        boolean b1 = list.stream().anyMatch(p1);
        System.out.println("1) " + b1);
        boolean b2 = list.stream().anyMatch(p2);
        System.out.println("2) " + b2);
    }
}
