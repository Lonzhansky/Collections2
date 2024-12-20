package lesson21.ann._02_meta_custom_annots._04;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class BookHandler {

    public static void main(String[] args)
            throws NoSuchMethodException, SecurityException {
//        new BookInfo();

        // Коли пишемо .class після імені класу, посилаємось
        // на літерал класу - об'єкт java.lang.Class, який
        // подає інформацію про даний клас.
        // Тут клас BookInfo.
        Class<BookInfo> infoClass = BookInfo.class;
        getAnnot(infoClass);
        // Метод getMethod() дозволяє отримати метод у класу.
        // Тут, метод getData() у класі BookInfo.
        Method method = infoClass.getMethod("getData");
        getAnnot(method);
    }
    // AnnotatedElement представляє анотовану конструкцію програми,
    // яка працює на даний момент на цій віртуальній машині.
    // Конструкція є або елементом, або типом.
    // Анотації до елемента відносяться до оголошення, тоді як
    // анотації до типу відносяться до конкретного використання
    // імені типу.
    static void getAnnot(AnnotatedElement element) {
        try  {
            System.out.println("\nAnnotation on " +
                    element.getClass().getName());
            // Метод getAnnotations() повертає анотації,
            // присутні у цьому елементі
            Annotation[] annotations = element.getAnnotations();

            for (Annotation annotation : annotations) {
                // instanceof - бінарний оператор, який використовується
                // для перевірки того, чи належить об'єкт заданому типу.
                // Результат операції або true, або false.
                // Він також відомий як оператор порівняння типів,
                // оскільки порівнює екземпляр із типом.
                // Перед приведенням невідомого об'єкта завжди треба
                // використовувати перевірку instanceof.
                // Це допомагає уникнути ClassCastException під час
                // виконання.
                if (annotation instanceof Book book) {
                    System.out.println("Author: " + book.author());
                    System.out.println("Title: " + book.title());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
