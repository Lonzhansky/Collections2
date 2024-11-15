package lesson21.ref._03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Отримання нового екземпляра класу,
// використовуючи private конструктор
public class Main03 {

    public static void main(String[] args) {
        try {
            Notification notification = new Notification("Info data");
            Class<?> cls = notification.getClass();

            // Отримуємо конструктор
            Constructor<?> constructor = cls.getDeclaredConstructor();
            // Встановлюємо доступ до private конструктору
            constructor.setAccessible(true);

            Notification ntf = (Notification) constructor.newInstance();
            ntf.setMsg("Information");
            ntf.getMessage(ntf.getMsg());

        } catch (NoSuchMethodException | IllegalArgumentException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
