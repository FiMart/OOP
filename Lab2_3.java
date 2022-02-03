import java.util.Scanner;

public class Lab2_3 
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the first city: ");
        String city_1 = inp.nextLine();
        
        System.out.print("Enter the second city: ");
        String city_2 = inp.nextLine();
        
        System.out.print("Enter the third city: ");
        String city_3 = inp.nextLine();
        
        String run;
        
        if((city_2.compareTo(city_1) < 0) && (city_2.compareTo(city_3) < 0))
        {
            run = city_1;
            city_1 = city_2;
            city_2 = run;
        }
        if((city_3.compareTo(city_1) < 0) && (city_3.compareTo(city_2) < 0))
        {
            run = city_1;
            city_1 = city_3;
            city_3 = run;
        }
        if(city_3.compareTo(city_2) < 0)
        {
            run = city_2;
            city_2 = city_3;
            city_3 = run;
        }
        // Output cities in A-Z ascending order
        System.out.println("The three cities in alphabetical order are " + city_1 + " " + city_2 + " " + city_3);
        inp.close();
    }
}