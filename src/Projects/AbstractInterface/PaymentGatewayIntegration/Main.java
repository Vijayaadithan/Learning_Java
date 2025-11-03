package Projects.AbstractInterface.PaymentGatewayIntegration;

public class Main
{
    public static void main(String[] args)
    {
        StripeGateway p1=new StripeGateway();
        p1.connect();
        p1.processPayment(500);
        p1.processRefund(200);
        p1.disconnect();
        PayPalGateway p2=new PayPalGateway();
        p2.connect();
        p2.processPayment(200);
        p2.processRefund(100);
        p2.disconnect();


    }
}
