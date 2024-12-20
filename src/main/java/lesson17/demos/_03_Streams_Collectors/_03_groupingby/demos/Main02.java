package lesson17.demos._03_Streams_Collectors._03_groupingby.demos;

import lesson17.demos._03_Streams_Collectors._03_groupingby.data.Product;
import lesson17.demos._03_Streams_Collectors._03_groupingby.data.ProductRepository;

import java.util.Map;
import java.util.stream.Collectors;

// Підраховуємо кількість товарів у кожній категорії.
// Потрібно згрупувати товари за категорією, а також передати
// Collectors.counting() як аргумент Collectors.groupingBy().
public class Main02 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Map<String, Long> map = repository.getDataA().stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.counting()));

        map.forEach((key, value) -> System.out.println("Category " + key +
                " has " + value + " products."));
    }
}
