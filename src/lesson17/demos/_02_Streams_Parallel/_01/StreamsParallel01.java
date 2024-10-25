package lesson17.demos._02_Streams_Parallel._01;

import java.util.Arrays;
import java.util.List;

// Створення паралельного потоку
// через метод parallelStream() колекції,
// який повертає паралельний потік
// з колекції як джерело.
public class StreamsParallel01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7, 5, 9, 4, 7, 9, 3);

        long count = list.parallelStream().count();

        System.out.println("Number of elements is " + count);
    }
}
