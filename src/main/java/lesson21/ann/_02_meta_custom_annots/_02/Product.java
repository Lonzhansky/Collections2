package lesson21.ann._02_meta_custom_annots._02;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// RetentionPolicy.RUNTIME - зберігається JVM,
// щоб анотацію можна було використовувати в середовищі
// виконання.
// @Repeatable - робимо анотацію Product повторюваною.
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Products.class)
// Кастомна повна/множинна анотація
@interface Product {
    String name() default "Orange";
    double price() default 0.00;
}
