package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PaymentNotificationTest {

    private String captureNotification(PaymentNotification payment){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try{
            System.setOut(new PrintStream(output));
            payment.notifyCustomer();
        } finally {
            System.setOut(originalOut);
        }

        return output.toString();
    }

    @Test
    void testOnlinePaymentNotification(){
        PaymentNotification payment = new OnlinePaymentNotification(new EmailChannel());

        String result = captureNotification(payment);

        assertTrue(result.contains("Email Notification: Your online payment was successful."));
    }

    @Test
    void testCashOnDeliveryPayment(){
        PaymentNotification payment = new CashOnDeliveryPayment(new SmsChannel());

        String result = captureNotification(payment);

        assertTrue(result.contains("SMS Notification: Your order will be paid with cash upon delivery."));
    }

    @Test
    void testBitcoinPayment(){
        PaymentNotification payment = new BitcoinPayment(new PushChannel());

        String result = captureNotification(payment);

        assertTrue(result.contains("Push Notification: Your Bitcoin payment was successful."));
    }

}
