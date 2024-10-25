package lesson17.demos._03_Streams_Collectors._04_teeing.demos;

import java.util.List;
import java.util.stream.Collectors;

// Отримання середнього значення елементів у списку.
// Тут, у методі teeing, перший колектор виконує роботу
// з підрахунку елементів, другий колектор виконує роботу
// з отримання суми елементів, а операція злиття виконує
// роботу з обчислення середнього значення.
public class Main02 {

    public static void main(String[] args) {

        List<Integer> list = List.of(9, 15, 3, 24, 12);

        Double average = list.stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingDouble(n -> n),
                        (count, sum) -> sum / count));

        System.out.println("Average of the list elements is " +
                average);
    }
}
