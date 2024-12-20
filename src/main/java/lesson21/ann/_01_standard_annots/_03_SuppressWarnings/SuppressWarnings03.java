package lesson21.ann._01_standard_annots._03_SuppressWarnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings03 {

    public static void main(String[] args) {
        getProductsList();
        getDayList();
        getDayList2();
    }

    // Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
    // @SuppressWarnings("unchecked")
    // вказує компілятору придушувати попередження,
    // коли використовуємо необроблені типи.
    @SuppressWarnings("unchecked")
    static void getProductsList() {

        List list = new ArrayList<>();

        // Викликає неперевірене попередження
        list.add("Orange");
        list.add("Milk");
        list.add("Banana");
        list.add(33);

        System.out.println("Product list: " + list);
    }

    // Raw use of parameterized class 'List'
    // Необроблений тип даних використовується
    // замість універсального.
    // @SuppressWarnings("rawtypes") - придушуємо
    @SuppressWarnings("rawtypes")
    static void getDayList() {

        // Необроблене використання
        // параметризованого класу
        List list = new ArrayList<>();

        // Викликає неперевірене попередження
        list.add("Mon");
        list.add("Tue");
        list.add("Wed");

        System.out.println("Day list: " + list);
    }

    // Множинний @SuppressWarnings
    @SuppressWarnings({"rawtypes", "unchecked"})
    static void getDayList2() {

        // Необроблене використання
        // параметризованого класу
        List list = new ArrayList<>();

        // Викликає неперевірене попередження
        list.add("Mon");
        list.add("Tue");
        list.add("Wed");
        list.add(12);

        System.out.println("Day list 2: " + list);
    }
}
