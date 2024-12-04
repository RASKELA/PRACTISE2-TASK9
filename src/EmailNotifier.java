public class EmailNotifier implements Observer {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void notify(TransportNotification notification) {
        System.out.println("EmailNotifier [" + email + "] received notification: " + notification.getMessage());
    }
}