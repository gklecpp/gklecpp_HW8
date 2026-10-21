package bridge;

public class CashOnDeliveryPayment extends PaymentNotification{

    public CashOnDeliveryPayment(NotificationChannel channel){
        super(channel);
    }

    @Override
    public void notifyCustomer(){
        channel.sendNotification("Your order will be paid with cash upon delivery.");
    }
}
