import java.util.Scanner;

public class Lab2_2 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);

        // Random int 0, 1 and 2
        int comp = (int)(Math.random() * 3);

        // User can enter number 0, 1 and 2
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = inp.nextInt();

        // Comp process User's number
        System.out.print("The computer is ");
        switch(comp)
        {
            case 0: System.out.print("scissor.");
                break;
            case 1: System.out.print("rock.");
                break;
            case 2: System.out.print("paper.");
                break;
        }
        System.out.print("You are ");
        switch(user)
        {
            case 0: System.out.print("scissor");
                break;
            case 1: System.out.print("rock");
                break;
            case 2: System.out.print("paper ");
        }

        if(comp == user )
        {
            System.out.println(" too. It is a draw :)");
        }
        else
        {
            boolean win = (user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1);
            if(win)
            {
                System.out.println(". You won!");
            }
            else
            {
                System.out.println(". You lose :(");
            }
        }
        inp.close();
    }
}
