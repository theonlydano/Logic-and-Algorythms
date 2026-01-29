package notificationsystem.creator;

import notificationsystem.product.EmailNotification;
import notificationsystem.product.Notification;

public class EmailNotificationCreator extends NotificationCreator {
    String emailAddress;
    String senderName;

    public EmailNotificationCreator(String emailAddress, String senderName) {
        this.emailAddress = emailAddress;
        this.senderName = senderName;
    }

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
