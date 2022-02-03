import java.util.Scanner;

public class Lab1_3 
{
    public static void main(String[] args) 
    {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000 : ");
        x = input.nextInt();

        int y = x%10 + (x/10)%10 + (x/100)%10 + x/1000;

        if(x>=0 && x <=1000) 
        {
            System.out.println("The sum of the digits is "+y);
        }
        else 
        {
            System.out.println(x+ "is Out of Range");
        }
        input.close();
    }
}