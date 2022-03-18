import java.util.*;

public class Account2 
{
    protected int id = 0;
    protected double balance = 0;
    protected double annualInterestRate = 0;
    protected Date dateCreated = new Date();

    public Account2() 
    {
    }

    public Account2(int id, double balance) 
    {
        System.out.println("Account");
        if(balance <= 0)
        {
            System.out.println("You can't enter balance in minus!!");
        }
        else
        {
            System.out.println("Balance is: " + balance);
        }
        this.balance = balance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double newBalance) 
    {
        balance = newBalance;
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

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    public String toString() 
    {
        if(balance <= 0)
        {
            return "This Account is Error!!\n";
        }
        else
        {
            return "Balance is " + balance + "\nThis account was created at " + dateCreated;
        }
    } 
}