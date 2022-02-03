import java.util.Scanner;

public class Lab1_2 
{
    public static void main(String[] args) 
    {
        float a;
        float b;
        float c;
        float d;
        float e;
        float f;
        float x;
        float y;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a = ");
        a = input.nextFloat();

        System.out.println("Enter b = ");
        b = input.nextFloat();

        System.out.println("Enter c = ");
        c = input.nextFloat();

        System.out.println("Enter d = ");
        d = input.nextFloat();

        System.out.println("Enter e = ");
        e = input.nextFloat();

        System.out.println("Enter f = ");
        f = input.nextFloat();

        x = (e*d - b*f) / (a*d - b*c);
        y = (a*f - e*c) / (a*d - b*c);

        if((a*d - b*c) == 0) 
        {
            System.out.println("ERROR");
        }
        else 
        {
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
        input.close();
    }
}
