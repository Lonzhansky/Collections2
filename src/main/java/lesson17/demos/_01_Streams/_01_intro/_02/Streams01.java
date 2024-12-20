package lesson17.demos._01_Streams._01_intro._02;

import java.util.ArrayList;
import java.util.List;

// Фільтруємо рядки завдовжки менше 5 (без Stream).
// Перебираємо весь список, щоб знайти рядки завдовжки менше 5.
// У цьому коді немає паралелізму.
public class Streams01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arnold");
        names.add("Megan");
        names.add("Tom");
        names.add("Steve");
        names.add("John");

        int count = 0;

        for (String str : names) {
            if (str.length() < 5)
                count++;
        }

        System.out.println("Names with length less than 5: " + count);
    }
}
