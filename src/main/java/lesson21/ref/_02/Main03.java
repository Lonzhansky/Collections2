package lesson21.ref._02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Виклик private методу класа
public class Main03 {

    public static void main(String[] args) {
        try {
            NoteService noteService = new NoteService("Informative data.");
            Class<?> cls = noteService.getClass();

            Method method = cls.getDeclaredMethod("formMessage", int.class);
            // Встановлюємо доступ до private методу
            method.setAccessible(true);
            // Викликаємо метод
            String message = (String) method.invoke(noteService, 25);
            System.out.println("Message - " + message);
        } catch (NoSuchMethodException | InvocationTargetException |
                 IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
