package lesson16.demos._05_pkg_JUF._04_Function._03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

// Дві реалізації інтерфейсу Function.
// У першому Function викликається функція andThen()
// з другим Function як аргументом.
// Коли метод apply() викликається у другому інтерфейсі
// Function, він спочатку виконує першу реалізацію Function,
// а потім другу.
//
// У першому інтерфейсі Function отримуємо зарплату співробітника,
// а потім у другому Function збільшимо її на 5%.
public class Main {

    public static void main(String[] args) {

        Function<Employee, Double> function1 = e -> e.getSalary();
        Function<Double, Double> function2 = i -> i + ((i * 5) / 100);

        List<Double> salaryList = mapTo(getData(),
                function1.andThen(function2));


        // compose() є зворотним по відношенню до andThen(),
        // cпершу викликається друга реалізація інтерфейсу Function,
        // а потім перша.
//        List<Double> salaryList = mapTo(getData(),
//                function2.compose(function1));

        getOutput(salaryList);
    }

    private static List<Employee> getData() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Bob", 1200));
        list.add(new Employee("Alice", 1990));
        list.add(new Employee("Tom", 2050));
        list.add(new Employee("Lucy", 1400));
        return list;
    }

    private static List<Double> mapTo(List<Employee> empList,
                                      Function<Employee, Double> mapper) {
        List<Double> salaryList = new ArrayList<>();
        for (Employee emp : empList) {
            salaryList.add(mapper.apply(emp));
        }
        return salaryList;
    }

    private static void getOutput(List<Double> salaryList) {
        AtomicInteger count = new AtomicInteger(1);
        salaryList.forEach(salary ->
                System.out.println(count.getAndIncrement() + ") "
                        + salary));
    }
}
