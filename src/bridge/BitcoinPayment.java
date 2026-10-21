package bridge;

public class BitcoinPayment extends PaymentNotification{

    public BitcoinPayment(NotificationChannel channel){
        super(channel);
    }

    @Override
    public void notifyCustomer(){
        channel.sendNotification("Your Bitcoin payment was successful.");
    }
}
