package notificationsystem.application;

import notificationsystem.creator.EmailNotificationCreator;
import notificationsystem.creator.NotificationCreator;
import notificationsystem.creator.SMSNotificationCreator;
import notificationsystem.product.Notification;

public class Main {
    public static void main(String[] args) {
        // Create creators
        NotificationCreator emailCreator =
                new EmailNotificationCreator("alice@example.com", "System Admin");
        NotificationCreator smsCreator = new SMSNotificationCreator("+355671234567");

        System.out.println("=== Version a: Client gets the products and uses them ===");
        Notification email = emailCreator.createNotification();
        Notification sms = smsCreator.createNotification();

        // Client is responsible for sending messages
        email.send("Welcome to our platform!");
        sms.send("Your verification code is 1234");

        System.out.println("\n=== Version b: Client only calls high- level method ===");
        emailCreator.notifyUser("Welcome to our platform!");
        smsCreator.notifyUser("Your verification code is 1234");
    }
}
