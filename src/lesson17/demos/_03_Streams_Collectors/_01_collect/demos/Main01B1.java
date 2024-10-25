package lesson17.demos._03_Streams_Collectors._01_collect.demos;


import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.List;

// toList() - збір до List.
// https://www.baeldung.com/java-stream-to-list-collecting
// Збір всіх найменувань товарів у список.
public class Main01B1 {

    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        getData(repository).forEach(System.out::println);
    }

    private static List<String> getData(ProductRepository provider) {
        return provider.getData().stream()
                // Method reference
                .map(Product::getName)
                .toList(); // <- immutable
    }
}
