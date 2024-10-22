package lesson16.demos._05_pkg_JUF._01_Consumer._02;

import java.util.Arrays;
import java.util.List;

public class DataProvider {

   public List<Contact> getData() {
        return Arrays.asList(
                new Contact("Tom", "tom@mail.com"),
                new Contact("Alice", "alice@mail.com"),
                new Contact("Lucy", "lucy@mail.com"),
                new Contact("Bob", "bob@mail.com"),
                new Contact("David", "david@mail.com")
        );
    }
}
