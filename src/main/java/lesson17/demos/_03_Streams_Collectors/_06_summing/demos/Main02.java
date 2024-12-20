package lesson17.demos._03_Streams_Collectors._06_summing.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {

    public static void main(String[] args) {

        List<Double> list = Arrays.asList(12.99, 17.95, 12.95, 5.75, 8.97);

        Double sum = list.stream()
                // WARNING: 'collect(summingDouble())' can be replaced with 'mapToDouble().sum()'
                .collect(Collectors.summingDouble(Double::doubleValue));
//       .mapToDouble(Double::doubleValue).sum();

        System.out.println("Sum of elements is " + sum);
    }
}
