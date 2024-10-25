package lesson17.demos._03_Streams_Collectors._04_teeing.data;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public List<Product> getData() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("apricot", "fruits", 550.25));
        list.add(new Product("plum", "fruits", 173.95));
        list.add(new Product("grape", "fruits", 395.99));
        list.add(new Product("tomato", "vegetables", 288.95));
        list.add(new Product("cucumber", "vegetables", 186.97));
        return list;
    }
}
