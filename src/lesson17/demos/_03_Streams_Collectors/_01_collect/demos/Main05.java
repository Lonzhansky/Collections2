package lesson17.demos._03_Streams_Collectors._01_collect.demos;

import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.stream.Collectors;

// Collectors.joining - перетворення об'єктів
// в рядки та об'єднання їх.
public class Main05 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        String names = repository.getData()
                .stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));

        System.out.println(names);
    }
}
