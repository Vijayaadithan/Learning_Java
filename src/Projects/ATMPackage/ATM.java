package Projects.ATMPackage;

public class ATM
{

    double balanceAmount=0.00;


    public void WithDraw(double amount) throws ArithmeticException , IllegalArgumentException
    {
        /*- If amount > balance → throw ArithmeticException.
            - If amount <= 0 → throw IllegalArgumentException.*/
        if(amount>balanceAmount)
        {
            throw new ArithmeticException("“Insufficient balance. Available Amount : "+balanceAmount );
        }
        if(amount<=0)
        {
            throw new IllegalArgumentException("Invalid amount entered.");
        }
        balanceAmount-=amount;
        System.out.println("Withdrawal Successfully Completed , Available amount : "+balanceAmount);
    }

}
