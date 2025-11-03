package Projects.BankManagementSystem;

public class Main
{
    public static void main(String[] args)
    {

        Bank bank=new Bank();

        Customer c1=new Customer("Alice",22,"50000.65");
        Customer c2=new Customer("Wondera",22,"45000.54");

        Account acc1=new SalaryAccount(c1);
        Account acc2=new SavingsAccount(c2);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        bank.deposit(acc1,5000);
        bank.deposit(acc2,7000);
        bank.transfer(acc2,acc1,1000);

        System.out.println("Accounts");
        bank.showAllAccounts();

        System.out.println("Transactions");
        bank.showAllTransaction();






    }
}
