import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TransportController controller = new TransportController();

        SMSNotifier smsNotifier = new SMSNotifier("+380975194364");
        TelegramNotifier telegramNotifier = new TelegramNotifier("@raskela");
        EmailNotifier emailNotifier = new EmailNotifier("ss.corobruh@gmail.com");

        controller.subscribe(smsNotifier);
        controller.subscribe(telegramNotifier);
        controller.subscribe(emailNotifier);

        TransportNotification notification = new TransportNotification(
                NotificationType.DELAY,
                "Bus on route 42 is delayed by 15 minutes.",
                "Route 42",
                LocalDateTime.now()
        );

        controller.addNotification(notification);
    }
}