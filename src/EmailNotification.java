public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("=== EMAIL NOTIFICATION ===");
        System.out.println("Sending Email Notification: " + message);
        System.out.println();
    }

}
