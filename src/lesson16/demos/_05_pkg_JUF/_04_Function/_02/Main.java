package lesson16.demos._05_pkg_JUF._04_Function._02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

// Список співробітників зіставляється
// зі списком імен
public class Main {

    public static void main(String[] args) {
        List<String> nameList = mapTo(getData(), e -> e.getName());
        getOutput(nameList);
    }

    private static List<Employee> getData() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Bob", 1200));
        list.add(new Employee("Alice", 1990));
        list.add(new Employee("Tom", 2050));
        list.add(new Employee("Lucy", 1400));
        return list;
    }

    private static List<String> mapTo(List<Employee> empList,
                                      Function<Employee, String> mapper) {
        List<String> nameList = new ArrayList<>();
        for (Employee emp : empList) {
            nameList.add(mapper.apply(emp));
        }
        return nameList;
    }

    private static void getOutput(List<String> nameList) {
        AtomicInteger count = new AtomicInteger(1);
        nameList.forEach(name ->
                System.out.println(count.getAndIncrement() +
                        ") " + name));
    }
}
