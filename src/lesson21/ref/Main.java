package lesson21.ref;

import java.lang.reflect.InvocationTargetException;
import java.sql.Ref;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

        Person person = new Person(30, "Den");

//        System.out.println(person.getAge());

//        ReflectionUtil.showFullClassName(person);
//        ReflectionUtil.showClassName(person);
//        ReflectionUtil.showClassFields(person);
//        ReflectionUtil.showAllClassFields(person);
//        ReflectionUtil.showAllClassMethods(person);

//        ReflectionUtil.setValuePrivateField(person, "age", 33);

//        System.out.println(person.getAge());


//        ReflectionUtil.showAllConstructors(person);

        Person person2 = (Person) ReflectionUtil.createNewObject(person);
        System.out.println(person2.getAge());
        System.out.println(person2.getName());
    }
}
