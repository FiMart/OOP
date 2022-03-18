import java.util.Scanner;

public class Lab7_1 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Checking Account (1) or Saving Account(2): ");
        int choice = reader.nextInt();

        if(choice == 1)
        {
            CheckingAccount account2 = new CheckingAccount(2, -5000, -5000);
            account2.withdraw(-10000);
            System.out.println(account2 + "\n");
        }
        else if(choice == 2)
        {
            SavingsAccount account3 = new SavingsAccount(3, -2000);
            account3.withdraw(-3000);
            System.out.println(account3 + "\n");
        }
        else
        {
            System.out.println("Error, You can choose 1 or 2...!");
        }

        Account2 account1 = new Account2(1, -1000);
        account1.withdraw(-100);
        System.out.println(account1 + "\n");

        reader.close();
    }
}