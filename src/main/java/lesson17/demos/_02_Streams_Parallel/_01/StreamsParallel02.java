package lesson17.demos._02_Streams_Parallel._01;

import java.util.stream.Stream;

// Створення паралельного потоку
// через метод parallel() інтерфейсу BaseStream.
// https://docs.oracle.com/javase/8/docs/api/java/util/stream/BaseStream.html
public class StreamsParallel02 {

    public static void main(String[] args) {

//        int sum = Stream.of(3, 5, 8, 2, 5)
//                .parallel().reduce(0, (a, b) -> a + b);

        // або

        int sum = Stream.of(3, 5, 8, 2, 5)
                .parallel().reduce(0, Integer::sum);

        System.out.println("Sum of elements is " + sum);
    }
}
