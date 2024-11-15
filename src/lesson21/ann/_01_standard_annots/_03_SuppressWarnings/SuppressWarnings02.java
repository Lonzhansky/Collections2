package lesson21.ann._01_standard_annots._03_SuppressWarnings;

public class SuppressWarnings02 {

    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        deprecatedMethod();
    }

    @Deprecated
    private static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }
}
