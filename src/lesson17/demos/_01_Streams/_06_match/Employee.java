package lesson17.demos._01_Streams._06_match;


public class Employee {

    private final int id;
    private final int age;
    private final String name;

    Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
