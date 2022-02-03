import java.util.Scanner;

public class Lab2_1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.printf("Enter today's day: ");
        int date = inp.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapse = inp.nextInt();

        int date_future = (date + elapse) % 7;
        String days = "";

        switch(date)
        {
            case 0: days = "Sunday";
                    break;
            case 1: days = "Monday";
                    break; 
            case 2: days = "Tuesday";
                    break;
            case 3: days = "Wednesday";
                    break;
            case 4: days = "Thursday";
                    break;
            case 5: days = "Friday";
                    break;
            case 6: days = "Saturday";
                    break;
        }

        if (date_future == 0)
        {
            System.out.printf("Todays is %s and the future day is Sunday.", days);
        }
        else if(date_future == 1)
        {
            System.out.printf("Todays is %s and the future day is Monday.", days);
        }
        else if(date_future == 2)
        {
            System.out.printf("Todays is %s and the future day is Tuesday.", days);
        }
        else if(date_future == 3)
        {
            System.out.printf("Todays is %s and the future day is Wednesday.", days);
        }
        else if(date_future == 4)
        {
            System.out.printf("Todays is %s and the future day is Thursday.", days);
        }
        else if(date_future == 5)
        {
            System.out.printf("Todays is %s and the future day is Friday.", days);
        }
        else if(date_future == 6)
        {
            System.out.printf("Todays is %s and the future day is Saturday.", days);
        }
        inp.close();
    }
}