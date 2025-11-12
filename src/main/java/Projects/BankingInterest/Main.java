package Projects.BankingInterest;
import Projects.BankingInterest.BankAccount;
public class Main
{
    public static void main(String[] args)
    {

        BankAccount bankAccount1=new BankAccount("Acc1",10_219.200);

        BankAccount bankAccount2=new BankAccount("Acc2",209.7400);

        BankAccount bankAccount3=new BankAccount("Acc3",9_000_219.990);

        System.out.println(BankAccount.getInterestRate());

        //Updating interest
        BankAccount.updateInterestRate(4.500);
        System.out.println(BankAccount.getInterestRate());




    }
}
