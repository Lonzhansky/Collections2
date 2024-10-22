package lesson16.demos._05_pkg_JUF._06_Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

// filter() приймає два аргументи: Predicate та List.
// З переданого List ті елементи, що проходять
// Predicate, додаються до іншого List.
public class Main02 {

    public static void main(String[] args) {
        Collection<Integer> values = filter(n -> n > 5, getData());
        getOutput(values);
    }

    private static List<Integer> getData() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(14);
        list.add(9);
        list.add(2);
        list.add(7);
        return list;
    }

    private static <T> Collection<T> filter(Predicate<T> predicate,
                                            Collection<T> listItems) {
        Collection<T> newList = new ArrayList<>();
        for (T item : listItems) {
            if (predicate.test(item)) {
                newList.add(item);
            }
        }
        return newList;
    }

    private static void getOutput(Collection<Integer> values) {
        System.out.println("New list - " + values);
    }
}
