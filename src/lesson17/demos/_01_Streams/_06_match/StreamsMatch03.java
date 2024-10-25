package lesson17.demos._01_Streams._06_match;

import java.util.List;
import java.util.function.Predicate;

// allMatch() повертає true, якщо
// усі елементи потоку задовольняють вимогам
// предикату, інакше він повертає false
public class StreamsMatch03 {

    public static void main(String[] args) {

        Predicate<Employee> p1 =
                emp -> emp.getName().startsWith("A");

        Predicate<Employee> p2 =
                emp -> emp.getAge() < 40;

        Predicate<Employee> p3 =
                emp -> emp.getAge() < 40 && emp.getName().startsWith("P");

        List<Employee> list = new DataRepository().getData();

        list.forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));

        boolean b1 = list.stream().allMatch(p1);
        System.out.println("1) " + b1);

        boolean b2 = list.stream().allMatch(p2);
        System.out.println("2) " + b2);

        boolean b3 = list.stream().allMatch(p3);
        System.out.println("3) " + b3);
    }
}
