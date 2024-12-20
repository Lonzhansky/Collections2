package lesson21.ann._02_meta_custom_annots._01;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

// Похідний клас, який успадковує супер-клас
// та кастомну анотацію
public class ProductInfo extends ProductData {

    public static void main(String[] arg) throws Exception {

        // Виведення анотації, яка використовується
        // для анотування супер- та похідного класу
        System.out.println(
                ProductInfo.class
                        .getAnnotation(Product.class)
        );

        System.out.println(
                ProductData.class.getAnnotation(
                        Product.class)
        );

        // Отримуємо ім'я супер-класу та
        // виводимо анотаційну інформацію про
        // анотації супер-класу
        Class<ProductData> obj = ProductData.class;

        // Отримуємо стан анотацій
        getAnnotState(obj);
    }

    // Виведення стану анотацій
    static void getAnnotState(AnnotatedElement element) {

        // Отримання всіх анотацій, прикріплених до
        // переданого елементу та збереження в масиві
        Annotation[] annotations = element.getAnnotations();

        // Виводимо усі анотації, які зберігаються в масиві
        for (Annotation annotation : annotations) {
            System.out.println(
                    "Annotation name : "
                            + annotation.annotationType());
            System.out.println(
                    "Value : "
                            + ((Product) annotation).value());
        }
    }
}
