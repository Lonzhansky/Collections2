package lesson21.ann._02_meta_custom_annots._06;

@Company
public class Employee {

    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getEmployeeInfo() {
        System.out.println("Employee id: " + id +
                "\nEmployee name: " + name);
    }
}
