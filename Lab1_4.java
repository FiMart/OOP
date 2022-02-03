import java.util.Scanner;

public class Lab1_4 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double W,H,bmi;

        System.out.print("Enter Weight in Pounds : ");
        W = input.nextDouble();
        System.out.print("Enter Height in Inches : ");
        H = input.nextDouble();

        if(W<=0 || (H<=0)) 
        {
            System.out.print("ERROR");
        }
        else 
        {
            W = W*0.45359247;
            H = H*0.0254;
            bmi = W/(H*H);

            System.out.print("BMI is "+bmi);
        }
        input.close();
    }
}
