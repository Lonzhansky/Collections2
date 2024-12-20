package lesson17.demos._01_Streams._01_intro._02;

import java.util.ArrayList;
import java.util.List;

// Фільтруємо рядки довжиною не більше 5 (з Stream).
// У прикладі метод stream() повертає потік усіх імен,
// метод filter() повертає ще один потік імен довжиною менше 5,
// метод count() зводить цей потік до результату.
// Усі ці операції відбуваються паралельно, отже, ми можемо
// розпаралелити код за допомогою потоків.
// Паралельне виконання операцій із використанням потоку швидше,
// аніж послідовне виконання без використання потоків.
public class Streams02 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arnold");
        names.add("Megan");
        names.add("Tom");
        names.add("Steve");
        names.add("John");

        // filter() є проміжною операцією.
        // Може бути більше однієї проміжної операції.
        // count() є термінальною операцією.
        long count = names.stream()
                .filter(str -> str.length() < 5)
                .count();


        System.out.println("Names with length less than 5: " + count);
    }
}
