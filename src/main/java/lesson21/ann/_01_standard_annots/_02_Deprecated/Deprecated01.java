package lesson21.ann._01_standard_annots._02_Deprecated;

public class Deprecated01 {

    public static void main(String[] args) {
        deprecatedMethod();
    }

    // Використовуємо тег Javadoc @deprecated для
    // документування застарілих елементів

    /**
     * @deprecated
     * This method is deprecated and has been replaced by newMethod()
     */
    @Deprecated
    private static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }
}
