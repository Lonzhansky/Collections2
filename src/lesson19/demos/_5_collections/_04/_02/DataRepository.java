package lesson19.demos._5_collections._04._02;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Product> getData() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("apple", 1.79));
        list.add(new Product("plum", 1.99));
        list.add(new Product("banana", 2.05));
        list.add(new Product("mango", 2.29));
        return list;
    }
}
