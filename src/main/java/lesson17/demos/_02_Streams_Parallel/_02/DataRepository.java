package lesson17.demos._02_Streams_Parallel._02;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Product> getData() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("apricot", "fruits", 5.99));
        list.add(new Product("plum", "fruits", 4.95));
        list.add(new Product("grape", "fruits", 3.99));
        list.add(new Product("tomato", "vegetables", 2.95));
        list.add(new Product("cucumber", "vegetables", 1.97));
        return list;
    }
}
