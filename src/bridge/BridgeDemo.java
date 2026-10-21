package bridge;

public class BridgeDemo {

    public static void main(String[] args){

        System.out.println("=== Online Payment ===");

        // online payment with email
        PaymentNotification onlineEmail = new OnlinePaymentNotification(new EmailChannel());
        onlineEmail.notifyCustomer();

        // online payment with SMS
        PaymentNotification onlineSms = new OnlinePaymentNotification(new SmsChannel());
        onlineSms.notifyCustomer();

        System.out.println("=== Cash on Delivery ===");

        // cash on delivery with email
        PaymentNotification cashEmail = new CashOnDeliveryPayment(new EmailChannel());
        cashEmail.notifyCustomer();

        // cash on delivery with SMS
        PaymentNotification cashSms = new CashOnDeliveryPayment(new SmsChannel());
        cashSms.notifyCustomer();

        System.out.println("=== Bitcoin Payment ===");

        // bitcoin with email
        PaymentNotification bitcoinEmail = new BitcoinPayment(new EmailChannel());
        bitcoinEmail.notifyCustomer();

        //bitcoin with SMS
        PaymentNotification bitcoinSms = new BitcoinPayment(new SmsChannel());
        bitcoinSms.notifyCustomer();

        System.out.println("=== Push Notifications ===");

        // bitcoin with email
        PaymentNotification onlinePush = new OnlinePaymentNotification(new PushChannel());
        onlinePush.notifyCustomer();

        // bitcoin payment with push
        PaymentNotification bitcoinPush = new BitcoinPayment(new PushChannel());
        bitcoinPush.notifyCustomer();


    }
}
