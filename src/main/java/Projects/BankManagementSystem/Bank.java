package Projects.BankManagementSystem;

import java.util.*;

public class Bank
{

    private List<Account> accounts=new ArrayList<>();
    private List<Transaction> transactions=new ArrayList<>();

    public void addAccount(Account account)
    {
        accounts.add(account);
        System.out.println("Account Created: "+account);
    }

    public void deposit(Account account,double amount)
    {
        account.depositAmount(amount);
        transactions.add(new Transaction(null,account,amount));
    }

    public void withdraw(Account account,double amount)
    {
       account.withdrawAmount(amount);
       transactions.add(new Transaction(account,null,amount));
    }

    public void transfer(Account toAccount,Account fromAccount,double amount)
    {
        if(fromAccount.getBalance()>=amount)
        {
            fromAccount.balance-=amount;
            toAccount.balance+=amount;
            transactions.add(new Transaction(fromAccount,toAccount,amount));

        }
        else
        {
            System.out.println("Transaction failed insufficient Balance!");
        }
    }

    public void showAllAccounts()
    {
        for(Account  acc:accounts )
        {
            System.out.println(acc);
        }
    }

    public void showAllTransaction()
    {
        for(Transaction trans:transactions)
        {
            trans.printTransaction();
        }
    }



}
