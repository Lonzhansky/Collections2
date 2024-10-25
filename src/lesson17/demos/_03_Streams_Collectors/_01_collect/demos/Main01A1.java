package lesson17.demos._03_Streams_Collectors._01_collect.demos;



import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

// Collectors.toList() - збір до List.
// https://www.baeldung.com/java-stream-to-list-collecting
// Збір всіх найменувань товарів у список.
public class Main01A1 {

    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        getData(repository).forEach(System.out::println);
    }

    private static List<String> getData(ProductRepository provider) {
        return provider.getData().stream()
                // WARNING: Lambda can be replaced with method reference
                .map(e -> e.getName())
                .collect(Collectors.toList()); // <- mutable
    }
}
