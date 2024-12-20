package lesson21.ann._02_meta_custom_annots._03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Створюємо контейнер анотації.
// Тип анотації, що вміщає в себе, повинен мати елемент
// value значення з типом масиву.
// Тип компоненту типу масиву має бути типом
// повторюваної анотації.
// RetentionPolicy.RUNTIME - зберігається JVM,
// щоб її можна було використовувати в середовищі виконання.
@Retention(RetentionPolicy.RUNTIME)
@interface Contacts {
    Contact[] value();
}
