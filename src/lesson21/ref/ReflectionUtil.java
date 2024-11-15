package lesson21.ref;

import java.lang.reflect.*;
import java.util.Objects;

public class ReflectionUtil {

    public static void showFullClassName(Object object) {
        Class<?> clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public static void showClassName(Object object) {
        Class<?> clazz = object.getClass();
        System.out.println(clazz.getSimpleName());
    }

    public static void showClassFields(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getModifiers());
        }
    }

    public static void showAllClassFields(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getModifiers());
        }
    }

    public static void showAllClassMethods(Object object) {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public static void setValuePrivateField(Object object, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field field = clazz.getDeclaredField(fieldName);

        field.setAccessible(true);
        field.set(object, newValue);
        field.setAccessible(true);
    }

    public static void showAllConstructors(Object object) {
        Class<?> clazz = object.getClass();
//        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
            System.out.println("modifier: " + constructor.getModifiers());
            System.out.println(constructor.getParameterCount());
//            System.out.println();

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getName());
            }

            System.out.println();
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public static Object createNewObject(Object object) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = object.getClass();

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

}
