package lesson17.demos._03_Streams_Collectors._05_averaging.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {

    public static void main(String[] args) {

        List<Double> list = Arrays.asList(12.99, 17.97, 25.05, 9.00, 5.95);

        Double avg = list.stream()
                .collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.printf("Average of the list elements is %.2f", avg);
    }
}
