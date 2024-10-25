package lesson17.demos._01_Streams._06_match;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Employee> getData() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(110, 23, "Lucy"));
        list.add(new Employee(285, 27, "Kate"));
        list.add(new Employee(427, 25, "Denis"));
        list.add(new Employee(722, 37, "Steve"));
        return list;
    }
}
