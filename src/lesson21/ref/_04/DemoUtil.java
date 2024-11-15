package lesson21.ref._04;

// Об'єкт цього класу повинен бути створений
public class DemoUtil {

    // private поле
    private final String str;

    // public конструктор
    public DemoUtil() {
        str = "Orange";
    }

    // public метод без параметрів
    public void methodNoParams() {
        System.out.println("The string is " + str);
    }

    // public метод з параметрами
    public void methodWithParam(int num) {
        System.out.println("The number is " + num);
    }

    // private метод
    private void methodPrivate() {
        System.out.println("Private method invoked");
    }
}
