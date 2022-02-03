import java.util.Scanner;

public class Lab2_4 
{
	public static void main(String[] args) 
    {
		// Scanner Object
		Scanner inp = new Scanner(System.in);

		// You can enter int from 1 to 15
		System.out.print("Enter the number of lines: ");
		int numberLines = inp.nextInt();
		
		if(numberLines >= 1 && numberLines <= 15)
		{
			// Output pyramid number pattern
			for (int rows = 1; rows <= numberLines; rows++) 
			{
				// Create spaces in each row
				for (int a = numberLines - rows; a >= 1; a--) 
				{
					System.out.print("  ");
				}
				// Create decending numbers in each row
				for (int b = rows; b >= 2; b--) 
				{
					System.out.print(b + " ");
				}
				// Create ascending number in each row
				for (int c = 1; c <= rows; c++) 
				{
					System.out.print(c + " ");
				}
				// End line
				System.out.println();
			}
		}
		else
		{
			System.out.print("You can enter number from 1-15");
			inp.close();
		}
	}
}