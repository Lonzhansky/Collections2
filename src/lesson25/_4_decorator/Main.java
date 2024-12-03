package lesson25._4_decorator;

// Базовий інтерфейс
interface Notification {
    void send(String message);
}

// Базова реалізація
class SimpleNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}

// Декоратор
abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification notification) {
        this.decoratedNotification = notification;
    }

    public void send(String message) {
        decoratedNotification.send(message);
    }
}

// Додає email до повідомлення
class EmailDecorator extends NotificationDecorator {
    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("...and sending as Email: " + message);
    }
}

// Додає SMS до повідомлення
class SMSDecorator extends NotificationDecorator {
    public SMSDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("...and sending as SMS: " + message);
    }
}

// Використання
public class Main {
    public static void main(String[] args) {
        // Базова реалізація
        Notification simpleNotification = new SimpleNotification();

        // Додаємо функціональність Email
        Notification emailNotification = new EmailDecorator(simpleNotification);

        // Додаємо функціональність SMS поверх Email
        Notification smsAndEmailNotification = new SMSDecorator(emailNotification);

        // Надсилаємо повідомлення з доданими функціями
        smsAndEmailNotification.send("Decorator Example: Hello!");
    }
}