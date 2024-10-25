package lesson17.demos._03_Streams_Collectors._05_averaging.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 9, 4, 2, 15);

        Double avg = list.stream()
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println("Average of the list elements is " + avg);
    }
}
