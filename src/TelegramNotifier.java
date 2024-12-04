public class TelegramNotifier implements Observer {
    private String userId;

    public TelegramNotifier(String userId) {
        this.userId = userId;
    }

    @Override
    public void notify(TransportNotification notification) {
        System.out.println("TelegramNotifier [" + userId + "] received notification: " + notification.getMessage());
    }
}