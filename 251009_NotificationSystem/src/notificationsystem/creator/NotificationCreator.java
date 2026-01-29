package notificationsystem.creator;

import notificationsystem.product.Notification;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void notifyUser(String message){
        Notification notification = createNotification();
        notification.send(message);
    }
}
