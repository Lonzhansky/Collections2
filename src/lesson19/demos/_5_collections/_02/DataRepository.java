package lesson19.demos._5_collections._02;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Integer> getData() {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(23);
        list.add(17);
        return list;
    }
}
