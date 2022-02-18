class Account 
{
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    //Constructor
    Account() 
    {
        dateCreated = new java.util.Date();
    }

    Account(int id, double balance) 
    {
        this();
        this.id = id;
        this.balance = balance;
    }

    //Accessor
    public int getId() 
    {
        return this.id;
    }

    public double getBalance() 
    {
        return this.balance;
    }

    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    public String getDateCreated() 
    {
        return this.dateCreated.toString();
    }

    public double getMonthlyInterestRate() 
    {
        return (annualInterestRate/100) /12;
    }

    public double getMonthlyInterest() 
    {
        return balance * getMonthlyInterestRate();
    }

    //Mutator
    public void setId(int id) 
    {
        this.id = id;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) 
    {
        if(this.balance < amount || this.balance - amount < 0 || amount < 0)
        {
            System.out.println("Can't Withdraw!");
        }
        else
        {
            this.balance -= amount;
        }
    }

    public void deposit(double amount) 
    {
        if(amount < 0)
        {
            System.out.println("Can't Deposit!");
        }
        else
        {
            this.balance += amount;
        }
    }

    public void toStrings()
    {
        System.out.println("ID: " + getId());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Monthly Interest: " + getMonthlyInterest());
        System.out.println("Date Created: " + getDateCreated());
    }
}
