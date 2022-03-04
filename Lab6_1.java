import java.util.Scanner;

public class Lab6_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name and Age: ");
        String[] nameAge = scanner.nextLine().split(" ");
        String name = nameAge[0];
        int age = Integer.parseInt(nameAge[1]);
        if(age <= 0)
        {
            System.out.print("Your age can't be younger than 0 or equal");
            System.exit(-1);
        }

        System.out.print("Weight(input format: 1 = kg 2 = pound value): ");

        int choice1 = scanner.nextInt();
        double weight = scanner.nextDouble();
        if(choice1 == 1)
        {
            if(weight <= 0)
            {
                System.out.print("Your weight can't less than 0 or equal");
                System.exit(1);
            }
        }
        else if(choice1 == 2)
        {
            if(weight <= 0)
            {
                System.out.print("Your weight can't less than 0 or equal");
                System.exit(1);
            }
        }
        else
        {
            System.out.print("Input format of Weight, You can input 1 or 2 only");
            System.exit(-2);
        }
        System.out.print("Height (input format: 1 = meter 2 = feet-inches): ");
        int choice2 = scanner.nextInt();
        double feet = 0;
        double inches = 0;
        if(choice2 == 1)
        {
            inches = scanner.nextDouble();
            inches /= 0.0254;
            if(inches <= 0)
            {
                System.out.print("Your Height can't less than 0 or equal");
                System.exit(-4);
            }
        }
        else if(choice2 == 2)
        {
            feet = scanner.nextDouble();
            inches = scanner.nextDouble();
            if((feet + inches) <= 0)
            {
                System.out.print("Your Height can't less than 0 or equal");
                System.exit(-5);
            }
        }
        else
        {
            System.out.print("Input format of Height, You can input 1 or 2 only");
            System.exit(-3);
        }
        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.print("Your BMI: ");
        System.out.printf("%.2f\n", bmi.getBMI());
        System.out.print("Interpretation: " + bmi.getInterpretation());
    }
}