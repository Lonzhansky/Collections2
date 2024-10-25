package lesson17.demos._01_Streams._03_filter._01;

import java.util.Arrays;
import java.util.List;

// filter() разом із reduce().
// reduce() використовується для скорочення елементів
// потоку до одного значення.
public class StreamsFilter05 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(21, 3, 4, 5, 8);

        // Отримання суми значень
        // кратних певному значенню
        int res = nums.stream()
                .filter(x -> x % 2 == 0)
                // Початкове значення 0
                .reduce(0, Integer::sum);

        System.out.println("The result is " + res);
    }
}
