public class Main {

    public static void main(String[] args) {

        String emailMessage = "Welcome to our system via Email!";
        String smsMessage = "Your OTP is 123456.";
        String pushMessage = "You have a new app alert!";


        NotificationService emailService = new EmailNotification();
        emailService.sendNotification(emailMessage);


        NotificationService smsService = new SMSNotification();
        smsService.sendNotification(smsMessage);


        NotificationService pushService = new PushNotification("DEVICE-001");
        pushService.setDefaultPriority("HIGH");
        pushService.sendNotification(pushMessage);
    }
}
