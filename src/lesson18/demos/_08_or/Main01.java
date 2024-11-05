package lesson18.demos._08_or;

import java.util.Optional;

public class Main01 {

    public static void main(String[] args) {

        Optional<String> opt1 = Optional.of("Orange");
        Optional<String> opt2 = Optional.empty();

        opt1 = opt1.or(() -> Optional.of("Apple"));
        System.out.println("1) " + opt1);

        opt2 = opt2.or(() -> Optional.of("Apple"));
        System.out.println("2) " + opt2);

        System.out.println("3) " + opt2.get());

    }
}
