package lesson21.ref._03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Отримання нового екземпляру класу
public class Main02 {

    public static void main(String[] args) {
        try {
            Notification notification = new Notification("Info data.");
            Class<?> cls = notification.getClass();

            Constructor<?> constructor = cls.getConstructor(String.class);
            // Через newInstance() створюємо екземпляр класу
            Notification ntf = (Notification) constructor.newInstance("Information");
            ntf.getMessage();

        } catch (NoSuchMethodException | IllegalArgumentException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
