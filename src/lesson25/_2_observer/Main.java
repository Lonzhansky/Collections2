package lesson25._2_observer;

import java.util.ArrayList;
import java.util.List;

// Інтерфейс Спостерігачів
interface Observer {
    void update(String message);
}

// Реалізація спостерігачів
class EmailObserver implements Observer {
    public void update(String message) {
        System.out.println("EmailObserver received: " + message);
    }
}

class SMSObserver implements Observer {
    public void update(String message) {
        System.out.println("SMSObserver received: " + message);
    }
}

// Суб'єкт
class NotificationService {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Використання:
public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        Observer emailObserver = new EmailObserver();
        Observer smsObserver = new SMSObserver();

        service.subscribe(emailObserver);
        service.subscribe(smsObserver);

        service.notifyObservers("Observer Example: System update available!");
    }
}