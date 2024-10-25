package lesson17.demos._01_Streams._03_filter._02;

import java.util.Arrays;
import java.util.List;

public class DataRepository {

    public List<Employee> getData() {
        return Arrays.asList(
                new Employee("Alice", "director", "555 235-9685"),
                new Employee("Lucy", "accountant", "555 009-2603"),
                new Employee("Tom", "seller", "555 121-7967"),
                new Employee("Sam", "seller", "555 877-1313"),
                new Employee("Lisa", "seller", "555 909-4748")
        );
    }
}
