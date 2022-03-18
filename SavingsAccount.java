import java.util.*;

public class SavingsAccount extends Account2 
{
    public SavingsAccount() 
    {
    }

    public SavingsAccount(int newId, double newBalance) 
    {
        System.out.println("\nSaving Account");
        if(newBalance <= 0)
        {
            System.out.println("You can't enter balance in minus!!");
        }
        else
        {
            System.out.println("Balance is: " + balance);
        }
        this.dateCreated = new Date();
    }

    public void withdraw(int amount) 
    {
        if(amount <= 0)
        {
            System.out.println("Because Your Balance is Minus, You can't Withdraw.");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
        }
        
    }

    public String toString() 
    {
        if(balance <= 0)
        {
            return "This Account is Error!!";
        }
        else
        {
            return "Balance is " + balance + "\nThis account was created at " + dateCreated;
        }
    } 
}