package lesson25._1_singleton;

class NotificationManager {
    private static NotificationManager instance;

    private NotificationManager() {}

    public static NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void sendNotification(String message) {
        System.out.println("Sending notification: " + message);
    }
}

// Використання:
public class Main {
    public static void main(String[] args) {
        NotificationManager manager = NotificationManager.getInstance();
        manager.sendNotification("Singleton Example: Hello!");
    }
}
