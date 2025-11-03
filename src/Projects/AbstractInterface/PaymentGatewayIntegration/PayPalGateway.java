package Projects.AbstractInterface.PaymentGatewayIntegration;

public class PayPalGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor
{

    public PayPalGateway()
    {
        super();
    }
    @Override
    public void connect()
    {
        System.out.println("Connected to PayPal API");
    }
    @Override
    public void disconnect()
    {
        System.out.println("Disconnected from PayPal API");
    }
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Processing payment of $"+amount+" via PayPal...");
    }
    @Override
    public void processRefund(double amount)
    {
        System.out.println("Processing refund of $"+amount+" via PayPal...");
    }
}
