package lesson17.demos._03_Streams_Collectors._04_teeing.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Отримання кількості та суми елементів
// у списку за допомогою функції Collectors.teeing.
// Передаючи Collectors.counting() та Collectors.summingInt()
// як два нижчих колектора, можемо виконати
// як підрахунок кількості елементів, і отримання суми
// елементів за одну операцію.
// Операція злиття виконує роботу зі збереження суми та
// кількості у списку та повернення цього списку.
public class Main01 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(9, 15, 3, 24, 12);

        List<Integer> list2 = list1.stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingInt(n -> n),
                        (count, sum) -> {
                            List<Integer> list3 = new ArrayList<>();
                            list3.add(count.intValue());
                            list3.add(sum);
                            return list3;
                        }));

        System.out.println("Number of the list elements is " +
                list2.get(0));
        System.out.println("Sum of the list elements is " +
                list2.get(1));
    }
}
