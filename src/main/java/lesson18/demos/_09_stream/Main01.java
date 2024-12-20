package lesson18.demos._09_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Main01 {

    public static void main(String[] args) {

        List<Optional<String>> optList = Arrays.asList(
                Optional.of("Orange"),
                Optional.of("Mango"),
                Optional.empty(),
                Optional.of("Kiwi")
        );


        // Java 8 style
        List<String> list1 = optList.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
        System.out.println("1) " + list1);

        // Java 9 style
        List<String> list2 = optList.stream()
                .flatMap(Optional::stream)
                .toList();
        System.out.println("2) " + list2);

        System.out.println("\nData list:");
        AtomicInteger cnt = new AtomicInteger(1);
        list2.forEach(name ->
                System.out.println(cnt.getAndIncrement() +
                        ") " + name));

    }
}
