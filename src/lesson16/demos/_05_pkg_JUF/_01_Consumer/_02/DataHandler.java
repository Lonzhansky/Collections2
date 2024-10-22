package lesson16.demos._05_pkg_JUF._01_Consumer._02;

import java.util.List;
import java.util.function.Consumer;

public class DataHandler {

    public void handleData(List<Contact> list, Consumer<Contact> consumer) {
        for (Contact contact : list) {
            consumer.accept(contact);
        }
    }

    public Consumer<Contact> getConsumer() {
        return contact ->
                new Outputer().getOutput(contact.toString());
    }
}
