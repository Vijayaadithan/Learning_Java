package Projects.AbstractInterface.PaymentGatewayIntegration;

public abstract class PaymentGateway
{
    private final String apiKey;
    private final String connectionURL;

    public PaymentGateway( )
    {
        this.apiKey="12345678";
        this.connectionURL="www.vijay.com";
    }
    public abstract void connect();
    public abstract void disconnect();

}
