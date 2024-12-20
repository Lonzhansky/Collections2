package lesson21.ref._01;

import java.lang.reflect.Field;

// Отримання та встановлення значення private поля
public class Main03 {

    public static void main(String[] args) {
        try {

            DemoUtil demoUtil = new DemoUtil();

            Class<?> cls = demoUtil.getClass();

            // Отримуємо конкретне поле
            Field fld = cls.getDeclaredField("quota");

            // Встановлюємо доступ.
            // Без цього, отримаємо виняток
            fld.setAccessible(true);

            // Виводимо значення
            System.out.println("Field name - " + fld.getName() +
                    ", Value - " + fld.get(demoUtil));

            // Встановлюємо нове значення
            fld.set(demoUtil, 15);
            System.out.println("Field name - " + fld.getName() +
                    ", Value - " + fld.get(demoUtil));

        } catch (IllegalAccessException | NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
