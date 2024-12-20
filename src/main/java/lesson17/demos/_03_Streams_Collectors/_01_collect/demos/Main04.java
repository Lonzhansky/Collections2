package lesson17.demos._03_Streams_Collectors._01_collect.demos;

import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.Map;
import java.util.stream.Collectors;

// Collectors.toMap() – збір до Map.
public class Main04 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Map<String, Double> map = repository.getData().stream()
                .collect(Collectors.toMap(Product::getName, Product::getCost));

        // WARNING: Can be replaced with 'Map.forEach()'
        map.entrySet().forEach(es -> {
            System.out.println("Name is " + es.getKey() +
                    ", cost USD " + es.getValue());
        });

        // Map.forEach()
//        map.forEach((key, value) ->
//                System.out.println("Name is " + key + ", cost USD " + value));
    }
}
