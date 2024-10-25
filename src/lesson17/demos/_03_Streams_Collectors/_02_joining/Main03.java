package lesson17.demos._03_Streams_Collectors._02_joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Об'єднуємо елементи List, використовуючи
// метод Collectors.joining().
public class Main03 {

    static List<String> list;
    static String str;

    public static void main(String[] args) {

        list = Arrays.asList("Orange", "Apple", "Lemon", "Plum");

        str = list.stream().collect(Collectors.joining());
        System.out.println("String - " + str);

        str = list.stream().collect(Collectors.joining(" "));
//        str = String.join(" ", list);
        System.out.println("String with space delimiter - " + str);

        str = list.stream().collect(Collectors.joining("|"));
        System.out.println("String with pipe delimiter - " + str);

        str = list.stream().collect(Collectors.joining("|", "[", "]"));
        System.out.println("String with delimiter, suffix, prefix - " + str);
    }
}
