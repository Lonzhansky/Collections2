package lesson17.demos._03_Streams_Collectors._01_collect.demos;



import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

// Collectors.toList() - збір до List.
// https://www.baeldung.com/java-stream-to-list-collecting
// Збір всіх найменувань товарів у список.
public class Main01A {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        List<String> names = repository.getData().stream()
                // WARNING: Lambda can be replaced with method reference
                .map(e -> e.getName())
                // WARNING: 'collect(toList())' can be replaced with 'toList()'
                // https://stackoverflow.com/questions/65969919/differences-of-java-16s-stream-tolist-and-stream-collectcollectors-tolist
                .collect(Collectors.toList()); // <- mutable

        names.forEach(System.out::println);
    }
}
