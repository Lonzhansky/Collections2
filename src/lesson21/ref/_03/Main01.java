package lesson21.ref._03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

// Отримання інформації про конструктори класа
public class Main01 {

    public static void main(String[] args) {
        try {
            Notification notification = new Notification("Info data.");
            Class<?> cls = notification.getClass();

            System.out.println("\n___ getConstructor() ___");
            Constructor<?> constructor = cls.getConstructor(String.class);
            System.out.println("Constructor name - " + constructor.getName());
            System.out.println("Constructor parameters - " +
                    Arrays.toString(constructor.getParameterTypes()));
            System.out.println("Constructor modifier - " +
                    Modifier.toString(constructor.getModifiers()));

            System.out.println("\n___ getDeclaredConstructor() ___");
            constructor = cls.getDeclaredConstructor();
            System.out.println("Constructor name - " + constructor.getName());
            System.out.println("Constructor parameters - " +
                    Arrays.toString(constructor.getParameterTypes()));
            System.out.println("Constructor modifier - " +
                    Modifier.toString(constructor.getModifiers()));

            System.out.println("\n___ getConstructors() ___");
            Constructor<?>[] ctrs = cls.getConstructors();
            System.out.println("Constructor name - " + Arrays.toString(ctrs));

            System.out.println("\n___ getDeclaredConstructors() ___");
            ctrs = cls.getDeclaredConstructors();
            for(Constructor<?> ctr : ctrs) {
                System.out.println("Constructor name - " + ctr.getName());
                System.out.println("Constructor parameters - " +
                        Arrays.toString(ctr.getParameterTypes()));
                System.out.println("Constructor modifier - " +
                        Modifier.toString(ctr.getModifiers()));
            }
        } catch (NoSuchMethodException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
