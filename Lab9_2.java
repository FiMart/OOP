import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class Lab9_2 
{
	public static void main(String[] args) throws FileNotFoundException 
    {
        // สร้างไฟล์ Salary.txt
		File file = new File("Salary.txt");

        // เช็คว่ามีไฟล์ไหม ถ้ามีให้แสดง already exists
		if (file.exists()) 
        {
			System.out.println("File " + file.getName() + " already exists");
			System.exit(0);
		}

		String rank = "";
		double salary;

        //สร้าง Output ไฟล์
		try (PrintWriter output = new PrintWriter(file);) 
        {
            // บันทึกข้อมูลลงไฟล์
			for (int i = 1; i <= 1000; i++) 
            {
				output.print("FirstName" + i + " LastName" + i);
				rank = getRank();
				salary = getSalary(rank);
				output.printf(" " + rank + " %.2f\n", salary);
			}
		}
        // ให้ Main Method โยน FileNotFoundException แล้วรับค่า e แล้วprint ค่า e ออกมา
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
	}

    // Return ค่าสุ่ม Rank(assistant, associate, full)
	public static String getRank() 
    {
		String[] ranks = {"assistant", "associate", "full"};
		return ranks[(int)(Math.random() * ranks.length)];
	}

    // Return ค่าสุ่ม Salary เงินเดือนของทั้ง 3 Rank(assistant, associate, full)
	public static double getSalary(String rank) 
    {
		if (rank.equals("assistant"))
        {
            return  50000 + (double)(Math.random() * 80000);
        }
		else if (rank.equals("associate"))
        {
            return 60000 + (double)(Math.random() * 110000);
        }
		else
        {
            return 75000 + (double)(Math.random() * 130000); 
        }
	}
}