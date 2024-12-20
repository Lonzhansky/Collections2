package lesson21.ref._01;

import java.lang.reflect.Field;

// Отримання та встановлення значень
public class Main02 {

    public static void main(String[] args) {

        try {

            DemoUtil demoUtil = new DemoUtil();

            Class<?> cls = demoUtil.getClass();

            // Отримуємо конкретне поле
            Field fld = cls.getField("nombre");

            // Виводимо значення
            System.out.println("Field name - " + fld.getName() +
                    ", Value - " + fld.get(demoUtil));

            // Встановлюємо нове значення
            fld.set(demoUtil, "Mango");

            System.out.println("Field name - " + fld.getName() +
                    ", Value - " + fld.get(demoUtil));

        } catch (IllegalAccessException | NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
