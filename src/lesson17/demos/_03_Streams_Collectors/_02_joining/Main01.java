package lesson17.demos._03_Streams_Collectors._02_joining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Передаємо масив символів як поток до методу collect,
// де метод Collectors.joining() використовується для отримання
// одного рядка, що поєднує всі символи масиву символів.
public class Main01 {

    static String str;

    public static void main(String[] args) {

        char[] ch = {'A', 'p', 'p','l', 'e', ' ', 'i', 's', ' ',
                'f', 'r', 'u', 'i', 't'};

        // WARNING: Lambda can be replaced with method reference
        str = Stream.of(ch).map(c ->
                new String(c)).collect(Collectors.joining());
        System.out.println("Lambda: " + str);

        str = Stream.of(ch).map(String::new).collect(Collectors.joining());
        System.out.println("Method reference: " + str);

    }
}
