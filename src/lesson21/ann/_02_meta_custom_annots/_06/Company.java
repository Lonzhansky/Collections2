package lesson21.ann._02_meta_custom_annots._06;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Company {
    String name() default "ABC";
    String city() default "London";
}
