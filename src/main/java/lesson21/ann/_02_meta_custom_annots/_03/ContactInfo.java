package lesson21.ann._02_meta_custom_annots._03;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ContactInfo {

    // Повторюємо Contact в цьому методі
    @Contacts(value = {
            @Contact(name = "Tom", phone = "055 123-5678"),
            @Contact(name = "Diana", phone = "099 123-6977")
    })
    public void getContactInfo() {

        ContactInfo obj = new ContactInfo();

        try {
            // Class - спеціальний клас для взаємодії з класами, який
            // дає можливість отримати інформацію про клас.
            // Метод getClass() повертає клас об'єкта як об'єкт Class<T>.
            // Тут використаний необмежений підстановний знак "?", оскільки
            // метод реалізований з використанням функцій, що надаються в
            // класі Object, саме getClass()
            Class<?> cls = obj.getClass();
            // Отримуємо анотацію цього методу, використовуючи рефлексію.
            Method method = cls.getMethod("getContactInfo");

            // Вводимо повторювану анотацію
            Annotation annot = method.getAnnotation(Contacts.class);
            System.out.println(annot);

        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
    }
}
