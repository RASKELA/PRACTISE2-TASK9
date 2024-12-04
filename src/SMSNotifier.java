public class SMSNotifier implements Observer {
    private String phoneNumber;

    public SMSNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(TransportNotification notification) {
        System.out.println("SMSNotifier [" + phoneNumber + "] received notification: " + notification.getMessage());
    }
}