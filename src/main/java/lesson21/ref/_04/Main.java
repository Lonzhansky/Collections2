package lesson21.ref._04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    static int count;

    public static void main(String[] args) throws Exception {

        // Створення об'єкта класу
        DemoUtil demoUtil = new DemoUtil();

        // Створення об'єкта класу з об'єкта за допомогою
        // методу getClass().
        // Він повертає екземпляр класу Class.
        // Його слід використовувати, якщо знаєте тип.
        Class<? extends DemoUtil> cls = demoUtil.getClass();

        // Виведення імені класу через getName()
        System.out.println("\nThe name of class is "
                + cls.getName());

        // Отримання конструктора класу через
        // об'єкт класу
        Constructor<? extends DemoUtil> constructor = cls.getConstructor();


        // Виведення імені конструктора через getName()
        System.out.println("\nThe name of constructor is "
                + constructor.getName());

        System.out.println("\nThe public methods of class are: ");

        // Отримання методів класу через об'єкт
        // класу за допомогою getMethods()
        Method[] methods = cls.getMethods();

        // Виводимо імена методів
        for (Method method : methods) {
            count++;
            System.out.println(count + ") " + method.getName());
        }

        // Просто розділювач
        System.out.print("\n");

        // Створюємо об'єкт методу шляхом
        // надання імені методу та класу параметра як
        // аргументи методу getDeclaredMethod()
        Method methodCall01
                = cls.getDeclaredMethod("methodWithParam", int.class);

        // Виклик методу під час виконання
        methodCall01.invoke(demoUtil, 12);

        // Створюємо об'єкт потрібного поля за
        // іменем поля як аргумент через
        // метод getDeclaredField()
        Field field = cls.getDeclaredField("str");

        // Дозволяємо об'єкту доступ до поля
        // незалежно від специфікатора доступу,
        // що використовується з полем
        field.setAccessible(true);

        // Приймаємо об'єкт та нове значення для присвоєння
        // у полі як аргументи
        field.set(demoUtil, "Apple");

        // Створюємо об'єкт методу, надаючи
        // ім'я методу як аргумент для
        // getDeclaredMethod()
        Method methodCall02
                = cls.getDeclaredMethod("methodNoParams");

        // Виклик методу під час виконання
        methodCall02.invoke(demoUtil);

        // Створюємо об'єкт методу, надаючи
        // ім'я методу як аргумент
        // в метод getDeclaredMethod()
        Method methodCall03
                = cls.getDeclaredMethod("methodPrivate");

        // Дозволяємо об'єкту отримати доступ до методу
        // незалежно від специфікатора доступу,
        // що використовується з методом
        methodCall03.setAccessible(true);

        // Виклик методу під час виконання
        methodCall03.invoke(demoUtil);
    }
}
