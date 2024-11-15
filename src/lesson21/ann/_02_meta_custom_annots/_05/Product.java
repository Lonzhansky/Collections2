package lesson21.ann._02_meta_custom_annots._05;

import java.lang.annotation.Documented;

// Кастомна анотація з @Documented
@Documented
@interface Product {
    String value();
}
