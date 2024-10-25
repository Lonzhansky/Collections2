package lesson17.demos._03_Streams_Collectors._01_collect.demos;


import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.List;

// toList() - збір до List.
// https://www.baeldung.com/java-stream-to-list-collecting
// Збір всіх найменувань товарів у список.
public class Main01B {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        List<String> names = repository.getData().stream()
                // Method reference
                .map(Product::getName)
                .toList(); // <- immutable

        names.forEach(System.out::println);
    }
}
