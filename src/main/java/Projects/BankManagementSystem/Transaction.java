package Projects.BankManagementSystem;

import java.time.LocalDateTime;

public class Transaction
{
    private static int transactionCounter=1;
    private int transactionId;
    private double amount;
    private Account fromAccount;
    private Account toAccount;
    private LocalDateTime localDateTime;

    public Transaction(Account fromAccount ,Account toAccount,double amount)
    {
        this.transactionId=Transaction.transactionCounter++;
        this.fromAccount=fromAccount;
        this.toAccount=toAccount;
        this.amount=amount;
        this.localDateTime= LocalDateTime.now();
    }

    public void printTransaction()
    {
        System.out.println("Transaction "+this.transactionId+
                " | Amount: " + this.amount +
                " | From: " + (this.fromAccount != null ? this.fromAccount.getAccountNumber() : "N/A") +
                " | To: " + (this.toAccount != null ? this.toAccount.getAccountNumber() : "N/A") +
                " | Date: " + this.localDateTime);
    }

}
