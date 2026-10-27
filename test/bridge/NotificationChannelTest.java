package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NotificationChannelTest {

    private String captureNotification(NotificationChannel channel, String message){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try{
            System.setOut(new PrintStream(output));
            channel.sendNotification(message);
        } finally {
            System.setOut(originalOut);
        }

        return output.toString();
    }

    @Test
    void testEmailChannel(){
        String result = captureNotification(new EmailChannel(), "Test payment");

        assertTrue(result.contains("Email Notification: Test payment"));
    }

    @Test
    void testSmsChannel(){
        String result = captureNotification(new SmsChannel(), "Test payment");

        assertTrue(result.contains("SMS Notification: Test payment"));
    }

    @Test
    void testPushChannel(){
        String result = captureNotification(new PushChannel(), "Test payment");

        assertTrue(result.contains("Push Notification: Test payment"));
    }
}
