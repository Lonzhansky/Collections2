package lesson17.demos._03_Streams_Collectors._05_averaging.demos;


import lesson17.demos._03_Streams_Collectors._05_averaging.data.Product;
import lesson17.demos._03_Streams_Collectors._05_averaging.data.ProductRepository;

import java.util.stream.Collectors;

// Отримуємо середню вартість товарів
public class Main03 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        Double avg = repository.getData().stream()
                .collect(Collectors.averagingDouble(Product::getCost));

        System.out.printf("Average product cost is USD %.2f", avg);
    }
}
