package lesson21.ann._02_meta_custom_annots._02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ProductInfo {

    // Повторюємо Product в цьому методі
    @Products(value = {
            @Product(name = "Milk", price = 12.99),
            @Product(name = "Banana", price = 23.95),
            @Product(name = "Lemon"),
            @Product // <- анотація без іменованих параметрів, значення default
    })
    public void getProductInfo() {

        ProductInfo obj = new ProductInfo();

        try {
            // Class - спеціальний клас для взаємодії з класами, який
            // дає можливість отримати інформацію про клас.
            // Метод getClass() повертає клас об'єкта як об'єкт Class<T>.
            // Тут використаний необмежений підстановний знак "?", оскільки
            // метод реалізований з використанням функцій, що надаються в
            // класі Object, саме getClass()
            Class<?> cls = obj.getClass();
            // Отримуємо анотацію цього методу, використовуючи рефлексію.
            // Метод getMethod() дозволяє отримати метод у класу.
            // Тут метод getProductInfo() - у класу ProductInfo.
            Method method = cls.getMethod("getProductInfo");

            // Вводимо повторювану анотацію
            Annotation annot = method.getAnnotation(Products.class);
            System.out.println(annot);

        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
    }
}
