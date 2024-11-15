package lesson21.ann._02_meta_custom_annots._06;


public class Main {

    public static void main(String[] args) {

        Manager manager =
                new Manager(258, "Tom");
        manager.getEmployeeInfo();

        Company company = manager
                .getClass()
                .getAnnotation(Company.class);

        System.out.println("Company name: " + company.name() +
                "\nCompany city: " + company.city());
    }
}
