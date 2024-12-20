package lesson17.demos._03_Streams_Collectors._01_collect.demos;

import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Collectors.groupingBy() - угруповання за полем.
// Групуємо товари за категоріями, повертається
// значення Map.
public class Main07 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Map<String, List<Product>> map = repository.getData().stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        map.forEach((key, value) -> {
            System.out.println("\nCategory - " + key + ":");
            value.forEach(name ->
                    System.out.println(name.getName()));
        });

    }
}
