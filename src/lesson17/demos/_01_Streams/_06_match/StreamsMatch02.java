package lesson17.demos._01_Streams._06_match;

import java.util.List;
import java.util.function.Predicate;

// noneMatch() повертає true, якщо жоден
// з елементів потоку відповідає предикату.
public class StreamsMatch02 {

    public static void main(String[] args) {

        Predicate<Employee> p1 =
                emp -> emp.getName().startsWith("L");

        Predicate<Employee> p2 =
                emp -> emp.getAge() < 28 &&
                        emp.getName().startsWith("P");

        List<Employee> list = new DataRepository().getData();
        list.forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));

        boolean b1 = list.stream().noneMatch(p1);
        System.out.println("1) " + b1);

        boolean b2 = list.stream().noneMatch(p2);
        System.out.println("2) " + b2);
    }
}
