package lesson25._6_abstract_factory;

// Базовий інтерфейс для повідомлень
interface Notification {
    void send(String message);
}

// Реалізації для Email
class WindowsEmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Windows Email: " + message);
    }
}

class MacEmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Mac Email: " + message);
    }
}

// Реалізації для SMS
class WindowsSMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Windows SMS: " + message);
    }
}

class MacSMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Mac SMS: " + message);
    }
}

// Абстрактна фабрика
interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSMSNotification();
}

// Реалізації фабрики для Windows
class WindowsNotificationFactory implements NotificationFactory {
    public Notification createEmailNotification() {
        return new WindowsEmailNotification();
    }

    public Notification createSMSNotification() {
        return new WindowsSMSNotification();
    }
}

// Реалізації фабрики для Mac
class MacNotificationFactory implements NotificationFactory {
    public Notification createEmailNotification() {
        return new MacEmailNotification();
    }

    public Notification createSMSNotification() {
        return new MacSMSNotification();
    }
}

// Використання:
public class Main {
    public static void main(String[] args) {
        // Вибір платформи
        NotificationFactory factory = new WindowsNotificationFactory();
        // NotificationFactory factory = new MacNotificationFactory();

        // Створення сповіщень
        Notification emailNotification = factory.createEmailNotification();
        Notification smsNotification = factory.createSMSNotification();

        // Використання
        emailNotification.send("Abstract Factory Example: Email message!");
        smsNotification.send("Abstract Factory Example: SMS message!");
    }
}