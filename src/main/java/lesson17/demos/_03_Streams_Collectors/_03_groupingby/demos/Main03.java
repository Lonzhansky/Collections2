package lesson17.demos._03_Streams_Collectors._03_groupingby.demos;

import lesson17.demos._03_Streams_Collectors._03_groupingby.data.Product;
import lesson17.demos._03_Streams_Collectors._03_groupingby.data.ProductRepository;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// Знаходимо максимальне значення в категорії
public class Main03 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Map<String, Optional<Product>> map = repository.getDataA().stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getCost))));

        map.forEach((key, value) -> System.out.println("Category - " + key +
                // WARNING: 'Optional.get()' without 'isPresent()' check
                ", product - " + value.get().getName() +
//                ", product - " + value.orElseThrow(IllegalArgumentException::new).getName() +
                ", cost USD " + value.get().getCost()));
    }
}
