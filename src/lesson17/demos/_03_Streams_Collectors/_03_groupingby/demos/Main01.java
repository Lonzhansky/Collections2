package lesson17.demos._03_Streams_Collectors._03_groupingby.demos;

import lesson17.demos._03_Streams_Collectors._03_groupingby.data.Product;
import lesson17.demos._03_Streams_Collectors._03_groupingby.data.ProductRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Групуємо товари відповідно до категорії.
// Використовуємо метод Collectors.groupingBy().
public class Main01 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Map<String, List<Product>> map = repository.getDataA().stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        map.forEach((key, value) -> {
            System.out.println("\nCategory - " + key + ":");
            value.forEach(e -> System.out.println(e.getName()));
        });

    }
}
