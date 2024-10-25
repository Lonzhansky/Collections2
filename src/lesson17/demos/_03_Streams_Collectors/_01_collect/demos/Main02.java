package lesson17.demos._03_Streams_Collectors._01_collect.demos;

import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.Set;
import java.util.stream.Collectors;

// Collectors.toSet() - збір до Set.
public class Main02 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Set<String> names = repository.getData().stream()
                .map(Product::getName)
                .collect(Collectors.toSet());

        names.forEach(System.out::println);
    }
}
