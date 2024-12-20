package lesson21.ref._02;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

// Отримання інформації про методи класа
public class Main01 {

    public static void main(String[] args) {

        try {
            NoteService noteService = new NoteService("Informative data.");
            Class<?> cls = noteService.getClass();

            System.out.println("\n___ getMethod(methodName, parameters) ____");
            Method method = cls.getMethod("sum", int.class, int.class);
            System.out.println("Method name - " + method.getName());
            System.out.println("Method params - " + Arrays.toString(method.getParameters()));
            System.out.println("Method param types - " + Arrays.toString(method.getParameterTypes()));
            System.out.println("Method returns - " + method.getReturnType());
            int mod = method.getModifiers();
            System.out.println("Method modifiers - " + Modifier.toString(mod));

            System.out.println("\n___ getDeclaredMethod(methodName, parameters) ___");
            System.out.println("Method name - " + method.getName());
            method = cls.getDeclaredMethod("formMessage", int.class);
            System.out.println("Method params - " + Arrays.toString(method.getParameters()));

            System.out.println("\n___ getMethods() ___");
            Method[] methods = cls.getMethods();
            System.out.println("All methods " + Arrays.toString(methods));

            System.out.println("\n___ getDeclaredMethods() ___");
            methods = cls.getDeclaredMethods();

            for(Method mtd: methods) {
                System.out.println("Method name - " + mtd.getName());
                System.out.println("Method parameters - " + Arrays.toString(mtd.getParameters()));
            }

        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
