package lesson25._5_factory_method;

// Базовий інтерфейс
interface Notification {
    void send(String message);
}

// Реалізації
class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Фабрика
class NotificationFactory {
    public Notification createNotification(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SMSNotification();
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}

// Використання:
public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification email = factory.createNotification("email");
        email.send("Factory Method Example: Hello via Email!");
    }
}