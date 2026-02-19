public class PushNotification implements NotificationService{
    private String deviceId;
    private String priority;


    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("= PUSH NOTIFICATION =");
        System.out.println("Device ID: " + deviceId);
        System.out.println("Priority: " + priority);
        System.out.println("Sending Push Notification: " + message);
        System.out.println();
    }


    @Override
    public void setDefaultPriority(String priority) {
        this.priority = priority;
    }

}
