package lesson17.demos._03_Streams_Collectors._01_collect.demos;

import lesson17.demos._03_Streams_Collectors._01_collect.data.Product;
import lesson17.demos._03_Streams_Collectors._01_collect.data.ProductRepository;

import java.util.stream.Collectors;

// Collectors.summingDouble() - підрахунок суми.
// Загальна вартість товару.
public class Main06 {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        double totalCost = repository.getData().stream()
                // WARNING: 'collect(summingDouble())' can be replaced with 'mapToDouble().sum()'
                .collect(Collectors.summingDouble(Product::getCost));
                // Зміна на mapToDouble().sum()
//                .mapToDouble(Product::getCost).sum();

        System.out.println("Total cost is USD " + totalCost);

    }
}
