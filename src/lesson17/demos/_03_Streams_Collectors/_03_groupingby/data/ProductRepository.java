package lesson17.demos._03_Streams_Collectors._03_groupingby.data;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public List<Product> getDataA() {
        return Arrays.asList(
                new Product("apricot", "fruits", 550.25),
                new Product("plum", "fruits", 173.95),
                new Product("grape", "fruits", 395.99),
                new Product("tomato", "vegetables", 288.95),
                new Product("cucumber", "vegetables", 186.97));
    }

    public List<Product> getDataB() {
        return Arrays.asList(
                new Product("apricot", "fruits", 550.25),
                new Product("plum", "fruits", 173.95),
                new Product("grape", "fruits", 395.99),
                new Product("tomato", "vegetables", 288.95),
                new Product("cucumber", "vegetables", 186.97),
                new Product("strawberry", "berries", 450.95),
                new Product("raspberry", "berries", 105.25)
        );
    }
}
