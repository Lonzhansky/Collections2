package lesson21.ann._02_meta_custom_annots._01;

import java.lang.annotation.*;

// Створення кастомної анотації.
// Якщо закоментуємо @Inherited, то успадкування
// кастомної анотації не буде.
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
// Кастомна одиночна анотація
@interface Product {
    String value() default "Orange";
}
