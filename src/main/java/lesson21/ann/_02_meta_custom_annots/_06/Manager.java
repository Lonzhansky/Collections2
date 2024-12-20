package lesson21.ann._02_meta_custom_annots._06;

// Оскільки Employee має анотацію @Company,
// а Manager успадковує Employee, то
// клас Manager не потребує включати @Company.
public class Manager extends Employee {

    public Manager(int id, String name) {
        super(id, name);
    }
}
