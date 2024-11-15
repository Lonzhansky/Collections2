package lesson21.ref;

public class Person {

    public String name;
    private int age;

    private Person() {
    }

    public Person(int age, String name) {
        setAge(age);
        this.name = name;
    }

    protected String getName3() {
        return name;
    }

    String getName2() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
