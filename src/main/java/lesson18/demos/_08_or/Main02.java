package lesson18.demos._08_or;

import java.util.Optional;

public class Main02 {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Orange");
//        Optional<String> optional = Optional.empty();

        // Java 8 style
        Optional<String> value =
                optional.isPresent() ? optional : Optional.of("Apple");
        System.out.println("1) " + value);

        // Java 9 style
        Optional<String> value1 =
                optional.or(() -> Optional.of("Apple"));
        System.out.println("2) " + value1);

    }
}
