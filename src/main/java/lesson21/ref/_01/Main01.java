package lesson21.ref._01;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// Отримання інформації про поля класу
public class Main01 {

    public static void main(String[] args) {

        try {

            DemoUtil demoUtil = new DemoUtil();

            Class<?> cls = demoUtil.getClass();

            // Отримуємно конкретне поле
            Field fld = cls.getField("nombre");

            // Отримуємо тип поля
            Class<?> type = fld.getType();

            // Отримуємо модифікатори поля
            int mod = fld.getModifiers();
            System.out.println("Field name - " + fld.getName());
            System.out.println("Field type - " + type.getName());
            System.out.println("Field modifiers - " +
                    Modifier.toString(mod));

            System.out.println("\nGet all fields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field name - " + field.getName());
                System.out.println("Field type - " + field.getType());
                System.out.println("Field modifiers - " +
                        Modifier.toString(field.getModifiers()));
            }
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
