import java.util.Scanner;
import java.io.File;

public class Lab9_3 
{
    public static void main(String[] args) 
    {
        double totalAssistant = 0;
        double totalAssociate = 0;
        double totalFull = 0;

        int countAssistant = 0;
        int countAssociate = 0;
        int countFull = 0;

        try(Scanner scan = new Scanner(new File("Salary.txt")))
        {
            while(scan.hasNextLine())
            {
                String[] data = scan.nextLine().split(" ");
                if(data[2].equals("assistant"))
                {
                    countAssistant++;
                    totalAssistant += Double.parseDouble(data[3]);
                }
                else if(data[2].equals("associate"))
                {
                    countAssociate++;
                    totalAssociate += Double.parseDouble(data[3]);
                }
                else
                {
                    countFull++;
                    totalFull += Double.parseDouble(data[3]);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.printf("Total salary for assistant professor is %,.2f\n", totalAssistant);
        System.out.printf("Total salary for associate professor is %,.2f\n",totalAssociate);
        System.out.printf("Total salary for full professor is %,.2f\n",totalFull);
        System.out.printf("Total salary for all professors is %,.2f\n",totalAssistant+totalAssociate+totalFull);
        System.out.println("------------------------------------------------------------------");
        System.out.printf("Average salary for assistant professor is %,.2f\n",totalAssistant/countAssistant);
        System.out.printf("Average salary for associate professor is %,.2f\n",totalAssociate/countAssociate);
        System.out.printf("Average salary for full professor is %,.2f\n",totalFull/countFull);
        System.out.printf("Average salary for all professors is %,.2f\n",(totalAssistant+totalAssociate+totalFull)/(countAssistant+ countAssociate +countFull));
    }
}
