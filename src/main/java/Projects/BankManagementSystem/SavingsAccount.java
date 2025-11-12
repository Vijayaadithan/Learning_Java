package Projects.BankManagementSystem;

import java.util.Scanner;

public class SavingsAccount extends Account
{

    Scanner sc=new Scanner(System.in);

    private static int acc=200;


    public SavingsAccount(Customer customer)
    {
        super(customer);
        this.accountNumber="BANKXXXX"+acc;
        this.interest=8.5;
        SavingsAccount.acc++;
    }

    @Override
    public  String getAccountNumber()
    {
        return this.accountNumber;
    }

    @Override
    public boolean isLoanAvailable()
    {
        if(this.pin==null)
        {
            System.out.println("You have not set pin for you account yet! Kindly set your pin for your account");
            this.setPin();
        }

        return this.loanTakenAlready.equals("no");
    }

    @Override
    public void getLoan(double amount,int year)
    {
        if(this.isLoanAvailable())
        {
            this.loanTakenAlready="yes";
            this.balance+=amount;
            this.loanAmount=amount;
            this.loanAmount+=calculateInterest(amount,year);//adding interest
            System.out.println("Loan Amount of "+amount+"credited to your Bank Account"+this.accountNumber+" and your current balance is Rs."+this.balance);
        }
        else
        {
            System.out.println("You already have a loan to repay..Kindly repay that to get a new Loan!");
        }
    }

    @Override
    public void returnLoan(double amount)
    {
        if(this.loanTakenAlready.equals("yes"))
        {
            if(amount<this.loanAmount)
            {
                this.loanAmount-=amount;
                System.out.println("Remaining loan Amount to Pay: "+this.getLoanAmountToBePaid());
            }
            else if(amount==this.loanAmount)
            {
                this.loanAmount=0.0;
                System.out.println("Loan Amount Totally Repaid");
                this.loanTakenAlready="no";
            }
            else//amount is greater than the loan Amount
            {
                this.loanTakenAlready="no";
                double rem=amount-this.loanAmount;
                this.loanAmount=0.0;
                this.balance+=rem;
                System.out.println("Loan Amount Totally Repaid and remaining Amount "+rem+" credited to the Account "+this.accountNumber+" and current balance is Rs."+this.getBalance());
            }

        }
        else
        {
            System.out.println("You don't have a loan to repay..Thanks!");
        }

    }

    @Override
    public double calculateInterest(double amount,int year)
    {
        double simpleInterest= amount*year*(interest/100);
        return simpleInterest;
    }
    @Override
    public double getInterestRate()
    {
        return this.interest;
    }

    @Override
    public double getLoanAmountToBePaid()
    {
        //tells remaining loan amount to be paid
        return this.loanAmount;
    }

    @Override
    public void depositAmount(double amount)
    {
        this.balance+=amount;
        System.out.println("Amount "+amount+" deposited to the Account "+this.accountNumber+" successfully and current Balance is Rs."+this.getBalance());

    }

    @Override
    public void withdrawAmount(double amount)
    {
        if(amount<=this.getBalance())
        {
            this.balance-=amount;
            System.out.println("Amount "+amount+" withdrawn from the Account "+this.accountNumber+" successfully and current Balance is Rs."+this.getBalance());

        }
        else
        {
            System.out.println("Not enough money in your Account. Please Enter Valid Amount!");
        }

    }

    @Override
    public double getBalance()
    {
        //tells current account balance
        return this.balance;
    }

    @Override
    public void setPin()
    {
        System.out.println("Enter you 4-digit PIN: ");
        this.pin=sc.next();
    }

    @Override
    public void changePin()
    {
        System.out.println("Enter your current PIN number: ");
        String pn=sc.next();
        if(this.pin.equals(pn))
        {
            this.setPin();
        }
        else
        {
            System.out.println("Wrong PIN Number Entered");
        }
    }

    @Override
    public Customer getCustomer()
    {
        return customer;
    }
}
