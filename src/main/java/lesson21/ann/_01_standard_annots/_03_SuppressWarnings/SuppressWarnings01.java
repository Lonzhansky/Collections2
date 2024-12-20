package lesson21.ann._01_standard_annots._03_SuppressWarnings;

import java.util.Calendar;
import java.util.Date;

public class SuppressWarnings01 {

    static Date date;
    static int year;
    static int month;
    static int day;

    public static void main(String[] args) {
        initVars();
        date = getSomeDate(day, month, year);
        System.out.println(date);
    }

    private static void initVars() {
        year = 2021;
        month = Calendar.NOVEMBER;
        day = 17;
    }

    // deprecation наказує компілятору
    // придушувати попередження, коли використовуємо
    // застарілий елемент
    @SuppressWarnings("deprecation")
    static private Date getSomeDate(int day, int month, int year) {
        return new Date(day, month, year);
    }
}
