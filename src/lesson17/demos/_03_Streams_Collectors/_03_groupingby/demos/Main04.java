package lesson17.demos._03_Streams_Collectors._03_groupingby.demos;

import lesson17.demos._03_Streams_Collectors._03_groupingby.data.Product;
import lesson17.demos._03_Streams_Collectors._03_groupingby.data.ProductRepository;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

// Сортування за ключами.
// Можемо повернути TreeMap у результаті
// використання методу groupingBy().
public class Main04 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Map<String, Set<String>> map = repository.getDataB().stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        TreeMap::new,
                        Collectors.mapping(Product::getName, Collectors.toSet())));

        map.forEach((key, value) -> {
            System.out.println("Category - " + key + ": ");
            value.forEach(name -> System.out.println(" - " + name));
        });
    }
}
