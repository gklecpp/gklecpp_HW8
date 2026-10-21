package bridge;

import java.lang.annotation.Inherited;

public class SmsChannel implements NotificationChannel{

    @Override
    public void sendNotification(String message){
        System.out.println("SMS Notification: " + message);
    }
}
