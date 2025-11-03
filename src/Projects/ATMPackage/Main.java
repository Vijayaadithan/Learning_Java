package Projects.ATMPackage;

import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try {
            String amo;
            System.out.print("Enter Amount to Withdraw : ");
            amo=sc.next();
            ATM User1=new ATM();
            double amount=Double.parseDouble(amo);
            User1.WithDraw(amount);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter a Valid Amount.");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally {
            sc.close();
        }


    }
}