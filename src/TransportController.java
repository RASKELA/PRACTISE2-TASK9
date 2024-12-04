import java.util.ArrayList;
import java.util.List;

public class TransportController {
    private List<TransportNotification> notifications;
    private List<Observer> observers;

    public TransportController() {
        this.notifications = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addNotification(TransportNotification notification) {
        notifications.add(notification);
        for (Observer observer : observers) {
            observer.notify(notification);
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}