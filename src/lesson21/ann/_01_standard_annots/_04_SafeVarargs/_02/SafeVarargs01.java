package lesson21.ann._01_standard_annots._04_SafeVarargs._02;

import java.util.ArrayList;
import java.util.List;

// NO USE @SafeVarargs
public class SafeVarargs01 {

    public static void main(String[] args) {

        SafeVarargs01 obj = new SafeVarargs01();

        List<String> list = new ArrayList();
        list.add("Milk");
        list.add("Orange");
        list.add("Banana");
        obj.printData(list);
    }


    private void printData(List<String>... names) {
        for (List<String> name : names) {
            System.out.println(name);
        }
    }
}
