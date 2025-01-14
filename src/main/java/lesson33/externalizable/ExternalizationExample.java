package lesson33.externalizable;

import java.io.*;

public class ExternalizationExample {
    public static void main(String[] args) {
        Person person = new Person("Bob", 40);

        // Серіалізація
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person_ext.ser"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десеріалізація
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person_ext.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println(deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}