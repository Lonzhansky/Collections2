package lesson17.demos._01_Streams._03_filter._02;

public class Employee {

    private final String name;
    private final String position;
    private final String phone;

    public Employee(String name, String position, String phone) {
        this.name = name;
        this.position = position;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", phone " + phone;
    }
}
