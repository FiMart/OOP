import java.util.*;

public class CheckingAccount extends Account2 
{
    private double overDraftLimit;
    CheckingAccount() 
    {
    }

    CheckingAccount(int newId, double newBalance, double newOverDraftLimit) 
    {
        System.out.println("\nChecking Account");
        if(newOverDraftLimit == newBalance)
        {
            System.out.println("Your Balance is minus, you can't use overdraftlimit.");
        }
        else
        {
            System.out.println("Overdraft Limit: " + newOverDraftLimit);
        }
        if(newBalance <= 0)
        {
            System.out.println("You can't enter balance in minus!!");
        }
        else
        {
            System.out.println("Balance is: " + balance);
        }
        this.balance = newBalance;
        this.overDraftLimit = newOverDraftLimit;
        this.dateCreated = new Date();
    }

    public void withdraw(double amount) 
    {
        System.out.println("Withdraw : " + amount);
        if (amount <= balance + overDraftLimit) 
        {
            balance -= amount;
        } 
        else 
        {
            System.out.println("Error, Because your balance is not same overdraftlimit and you can't withdraw.");
        }
    }

    public void setOverdraftLimit(double newOverdraftLimit) 
    {
        overDraftLimit = newOverdraftLimit;
    }

    public double getOverdraftLimit() 
    {
        return overDraftLimit;
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