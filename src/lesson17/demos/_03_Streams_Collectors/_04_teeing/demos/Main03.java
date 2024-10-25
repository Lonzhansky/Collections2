package lesson17.demos._03_Streams_Collectors._04_teeing.demos;



import lesson17.demos._03_Streams_Collectors._04_teeing.data.Product;
import lesson17.demos._03_Streams_Collectors._04_teeing.data.ProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Використання Collectors.teeing() для отримання товарів
// з максимальною та мінімальною вартістю.
public class Main03 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        List<Optional<Product>> list = repository.getData().stream()
                .collect(Collectors.teeing(
                        Collectors.maxBy(Comparator.comparingDouble(Product::getCost)),
                        Collectors.minBy(Comparator.comparingDouble(Product::getCost)),
                        (prod1, prod2) -> {
                            List<Optional<Product>> list1 = new ArrayList<>();
                            list1.add(prod1);
                            list1.add(prod2);
                            return list1;
                        }));

        System.out.println("Product with max cost - " +
                (list.get(0).isPresent() ? list.get(0).get().getName() : null));
        System.out.println("Product with min cost - " +
                (list.get(1).isPresent() ? list.get(1).get().getName() : null));

    }
}
