package lesson18.demos._09_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main02 {

    public static void main(String[] args) {

        List<Optional<String>> optList = Arrays.asList(
                Optional.empty(),
                Optional.of("Orange"),
                Optional.empty(),
                Optional.of("Mango")
        );

        // Намагаємося отримати не порожні значення
        // Якщо Optional не порожній, отримаємо значення в потоці,
        // інакше повертаємо порожнім

        List<String> list1 = optList.stream()
                .flatMap(opt ->
                        opt.isPresent() ? Stream.of(opt.get()) : Stream.empty())
                .toList();
        System.out.println("1) " + list1);


        List<String> list2 = optList.stream()
                .flatMap(Optional::stream)
                .toList();
        System.out.println("2) " + list2);
    }
}
