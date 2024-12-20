package lesson17.demos._01_Streams._01_intro._03;

import java.util.stream.Stream;

// Ітерація та відображення вибраних цілих чисел
public class Streams01 {

    public static void main(String[] args) {

        Stream.iterate(1, count -> count + 1)
                .filter(number -> number % 3 == 0)
                .limit(6)
                .forEach(System.out::println);
    }
}
