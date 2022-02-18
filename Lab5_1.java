public class Lab5_1 
{
    public static void main(String[] args) 
    {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        account.toStrings();
    }
}

