package Projects.BankManagementSystem;

public abstract class Account
{
    protected String accountNumber;
    protected String pin;
    protected double interest;
    protected String loanTakenAlready;
    protected double balance;
    protected double loanAmount;
    protected Customer customer;

    public Account(Customer customer)
    {
        this.customer=customer;
        this.loanTakenAlready="no";
        this.loanAmount=0.0;
    }
    public abstract String getAccountNumber();
    public abstract boolean isLoanAvailable();
    public abstract void getLoan(double amount,int year);
    public abstract void returnLoan(double amount);
    public abstract double calculateInterest(double amount,int year);
    public abstract double getInterestRate();
    public abstract double getLoanAmountToBePaid();

    public abstract void depositAmount(double amount);
    public abstract void withdrawAmount(double amount);
    public abstract double getBalance();

    public abstract void setPin();
    public abstract void changePin();
    public abstract Customer getCustomer();


    @Override
    public String toString() {
        return "Account No: " + accountNumber + ", Owner: " + customer.getName() + ", Balance: " + balance;
    }


}
