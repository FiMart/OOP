import java.util.Scanner;

public class Lab3_3 
{
    static Scanner in = new Scanner(System.in);
    static int[][] matrix;

    public static void main(String[] args) 
    {
        System.out.print("Enter the size for the matrix: ");
        int num = in.nextInt();
        matrix = new int[num][num];
        for (int a = 0; a < matrix.length; a++) 
        {
            for (int b = 0; b < matrix.length; b++) 
            {
                matrix[a][b] = (int) (Math.random() * 2);
                System.out.print(matrix[a][b]);
            }
            System.out.println();
        }
        checkRow();
        checkCol();
        checkSuper();
        diagonal();
        subdiagonal();
    }

    public static void checkRow() 
    {
        boolean noSameNumber = true;
        for (int r = 0; r < matrix.length; r++) 
        {
            for (int a = 0; a < 2; a++) 
            {
                if (checkMatrix(a, r, 0, 0, 1, matrix.length)) 
                {
                    System.out.println("All " + a + "s on row " + r);
                    noSameNumber = false;
                }
            }
        }
        if (noSameNumber) 
        {
            System.out.println("No same numbers on a row");
        }
    }

    public static void checkCol() 
    {
        boolean noSameNumber = true;
        for (int col = 0; col < matrix.length; col++) 
        {
            for (int a = 0; a < 2; a++) 
            {
                if (checkMatrix(a, 0, col, 1, 0, matrix.length)) 
                {
                    System.out.println("All " + a + "s on column " + col);
                    noSameNumber = false;
                }
            }
        }
        if (noSameNumber) 
        {
            System.out.println("No same numbers on a column");
        }
    }

    public static void checkSuper() 
    {
        boolean noSameNumber = true;
        for (int a = 0; a < 2; a++) 
        {
            if (checkMatrix(a, 0, 1, 1, 1, matrix.length - 1)) 
            {
                System.out.println("All " + a + "s on the superdiagonal");
                noSameNumber = false;
            }
        }
        if (noSameNumber) 
        {
            System.out.println("No same numbers on the superdiagonal");
        }
    }

    public static void diagonal() 
    {
        boolean noSameNumber = true;
        for (int a = 0; a < 2; a++) 
        {
            if (checkMatrix(a, 0, 0, 1, 1, matrix.length)) 
            {
                System.out.println("All " + a + "s on the diagonal");
                noSameNumber = false;
            }
        }
        if (noSameNumber) 
        {
            System.out.println("No same numbers on the diagonal");
        }
    }

    public static void subdiagonal() 
    {
        boolean noSameNumber = true;
        for (int a = 0; a < 2; a++) 
        {
            if (checkMatrix(a, 1, 0, 1, 1, matrix.length - 1)) 
            {
                System.out.println("All " + a + "s on the subdiagonal");
                noSameNumber = false;
            }
        }
        if (noSameNumber) 
        {
            System.out.println("No same numbers on the subdiagonal");
        }
    }

    public static boolean checkMatrix(int check, int row, int col, int stepRow, int stepCol, int length) 
    {
        for (int a = 0; a < length; a++) 
        {
            if (matrix[row + stepRow * a][col + stepCol * a] != check) 
            {
                return false;
            }
        }
        return true;
    }
}