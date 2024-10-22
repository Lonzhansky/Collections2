package lesson16.demos._05_pkg_JUF._01_Consumer._02;

public class Contact {

    private final String name;
    private final String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact: " + name
                + ", email: " + email;
    }
}
