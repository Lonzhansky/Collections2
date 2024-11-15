package lesson21.ref._02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Виклик методу класа
public class Main02 {

    public static void main(String[] args) {
        try {
            NoteService noteService = new NoteService("Informative data.");
            Class<?> cls = noteService.getClass();
            Method method = cls.getMethod("sum", int.class, int.class);
            // Викликаємо метод
            method.invoke(noteService, 7, 9);
            // Показуємо метод
            System.out.println(method);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException |
                 IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
