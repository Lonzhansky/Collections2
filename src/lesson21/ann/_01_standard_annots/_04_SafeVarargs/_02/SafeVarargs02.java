package lesson21.ann._01_standard_annots._04_SafeVarargs._02;

import java.util.ArrayList;
import java.util.List;

// USE @SafeVarargs and @SuppressWarnings
public class SafeVarargs02 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        SafeVarargs02 obj = new SafeVarargs02();
        @SuppressWarnings("rawtypes")
        List<String> list = new ArrayList();
        list.add("Milk");
        list.add("Orange");
        list.add("Banana");
        obj.printData(list);
    }

    @SafeVarargs
    private void printData(List<String>... names) {
        for (List<String> name : names) {
            System.out.println(name);
        }
    }
}
