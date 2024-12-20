package lesson17.demos._03_Streams_Collectors._01_collect.demos;


import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

// Collectors.toList() - збір до List.
// https://www.baeldung.com/java-stream-to-list-collecting
// https://stackoverflow.com/questions/65969919/differences-of-java-16s-stream-tolist-and-stream-collectcollectors-tolist
// Збір всіх найменувань товарів до списку
// і виведення в нумерований список.
public class Main01C {

    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        getOutput(getData(repository));
    }

    private static List<String> getData(ProductRepository provider) {
        return provider.getData().stream()
                .map(Product::getName)
                .collect(Collectors.toList()); // <- mutable
    }

    private static void getOutput(List<String> names) {
        AtomicInteger count = new AtomicInteger(0);
        names.add("cherry"); // change Collectors.toList() is possible
        names.forEach(name -> System.out.println(count.incrementAndGet() +
                ") " + name));
    }
}
