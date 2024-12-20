package lesson17.demos._03_Streams_Collectors._02_joining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Передаємо String масив як Stream методу collect,
// щоб отримати один рядок.
// Використовуємо метод joining, в якому як аргумент
// передається роздільник.
public class Main02 {

    static String[] strArr;
    static String str;

    public static void main(String[] args) {

        strArr = new String[]{"This", "is", "tasty", "fruit"};

        // WARNING: Can be replaced with 'String.join'
        str = Stream.of(strArr).collect(Collectors.joining());
//        str = String.join("", strArr);
        System.out.println("String - " + str);

        str = Stream.of(strArr).collect(Collectors.joining(" "));
        System.out.println("String with space delimiter - " + str);

        str = Stream.of(strArr).collect(Collectors.joining("|"));
        System.out.println("String with pipe delimiter - " + str);

        str = Stream.of(strArr).collect(Collectors.joining("|", "[", "]"));
        System.out.println("String with delimiter, suffix, prefix - " + str);

    }
}
