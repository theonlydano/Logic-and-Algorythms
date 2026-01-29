package notificationsystem.creator;

import notificationsystem.product.Notification;
import notificationsystem.product.SMSNotification;

public class SMSNotificationCreator extends NotificationCreator {

    String phoneNumber;

    public SMSNotificationCreator(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
