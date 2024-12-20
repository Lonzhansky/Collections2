package lesson18.demos._10_orElseThrow;

import java.util.Optional;

// orElseThrow() якщо значення присутнє,
// повертає значення, інакше генерує виняткову
// ситуацію, створену функцією надання винятку.
public class Main {

    public static void main(String[] args) {

//        String email = null;
        String email = "alice@mail.com";

        Optional<String> optional = Optional.ofNullable(email);

        String data =
                optional.orElseThrow(() ->
                        new IllegalArgumentException("No data."));

        System.out.println("Data: " + data);
    }
}
