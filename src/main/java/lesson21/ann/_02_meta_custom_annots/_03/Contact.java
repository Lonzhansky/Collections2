package lesson21.ann._02_meta_custom_annots._03;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// RetentionPolicy.RUNTIME - зберігається JVM,
// щоб анотацію можна було використовувати в середовищі
// виконання.
// @Repeatable - робимо анотацію  Contact повторюваною.
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Contacts.class)
@interface Contact {
    String name();
    String phone();
}
