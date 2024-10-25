package lesson17.demos._03_Streams_Collectors._06_summing.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 12, 4, 6, 21);

        int sum = list.stream()
                // WARNING: 'collect(summingInt())' can be replaced with 'mapToInt().sum()'
                .collect(Collectors.summingInt(Integer::intValue));
//                .mapToInt(Integer::intValue).sum();

        System.out.println("Sum of elements is " + sum);
    }
}
