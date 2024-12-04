import java.time.LocalDateTime;

public class TransportNotification {
    private NotificationType type;
    private String message;
    private String route;
    private LocalDateTime timestamp;

    public TransportNotification(NotificationType type, String message, String route, LocalDateTime timestamp) {
        this.type = type;
        this.message = message;
        this.route = route;
        this.timestamp = timestamp;
    }

    public NotificationType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getRoute() {
        return route;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}