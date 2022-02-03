import java.util.Scanner;

public class Lab3_2 
{

	public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);

		// Enter number in list1 and list2
		System.out.print("Enter list1: ");
		int[] list1 = new int[in.nextInt()];
		for (int a = 0; a < list1.length; a++) 
        {
			list1[a] = in.nextInt();
		}

		System.out.print("Enter list2: ");
		int[] list2 = new int[in.nextInt()];
		for (int a = 0; a < list2.length; a++) 
        {
			list2[a] = in.nextInt();
		}

		// Merge lists
		int[] list3 = merge(list1, list2);

		// Output the merged list
		System.out.print("The merged list is");
		for (int e: list3) 
        {
			System.out.print(" " + e);
		}
		System.out.println();
        in.close();
	}

    // Merge 2 list
	public static int[] merge(int[] list1, int[] list2)  
    {
		int[] list3 = new int[list1.length + list2.length];
		
		for (int a = 0; a < list1.length; a++)
			list3[a] = list1[a];

		for (int a = 0, b = list1.length; a < list2.length; a++, b++) 
        {
			list3[b] = list2[a];	
		}
		sort(list3);
		return list3;
	}

    // Sort Ascending Order Numbers
	public static void sort(int[] list) 
    {
		for (int a = 0; a < list.length - 1; a++) 
        {
			int min = list[a];
			int minIndex = a;

			for (int b = a + 1; b < list.length; b++) 
            {
				if (list[b] < min) 
                {
					min = list[b];
					minIndex = b; 
				}					
			}

			if (minIndex != a) 
            {
				list[minIndex] = list[a];
				list[a] = min;
			}
		}
	}
}