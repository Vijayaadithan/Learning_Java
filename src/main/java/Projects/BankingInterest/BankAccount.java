package Projects.BankingInterest;

public class BankAccount
{
//    Context:
//    Bank interest rate is the same for all customers:
//        - BankAccount class contains:
//        - Static field interestRate.
//- Static method updateInterestRate().
//        - Instance fields for accountNumber and balance.
//- Changing the interest rate should reflect for all account holders.
//    Assignment Tasks:
//        1. Create 3 BankAccount objects with different balances.
//2. Update the interest rate via static method and verify it changes for all accounts.
//        3. Show how the static member behaves even without creating any objects.

    private static double interestRate=2.5;
    private String accountNumber;
    private double balanceAmount;

    BankAccount(String accountNumber,double balanceAmount)
    {
        this.accountNumber=accountNumber;
        this.balanceAmount=balanceAmount;
    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }

    public static double getInterestRate() {
        return BankAccount.interestRate;
    }

    public static void updateInterestRate(double interestRate)
    {
        BankAccount.interestRate=interestRate;
    }



}
