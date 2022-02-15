public class Lab4_3 
{
    public static void main(String[] args) 
    {
        StopWatch sw = new StopWatch();
        System.out.println("Creating a list containing 1000 elements,");
        double[] list = new double[1000];
        for (int i = 0; i < list.length; i++) 
        {
            list[i] = Math.random() * 1000;
            System.out.printf("%10.2f", list[i]);
            if ((i + 1) % 5 == 0) 
            {
                System.out.println();
            }
        }
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        sw.start();
        selectionSort(list);
        for (int i = 0; i < list.length; i++) 
        {
            System.out.printf("%10.2f", list[i]);
            if ((i + 1) % 5 == 0) 
            {
                System.out.println();
            }
        }
        sw.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is " + sw.getElapsedTime() + " milliseconds.");
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        sw.start();
        final int max_displays = 1000;
        int number = 2;
        int num_print = 0;
        System.out.println();
        while (num_print < max_displays) 
        {
            if (isPalindrome(number) && isPrime(number)) 
            { 
                System.out.print(number + " ");
                if (++num_print % 10 == 0) 
                {
                    System.out.println();
                }
            }
            number++;
        }
        System.out.println();
        System.out.println("PalindromePrime created.");
        sw.stop();
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+sw.getElapsedTime()+" milliseconds.");
    }

    public static boolean isPrime(int number) 
    {
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static int reverse_number(int number) 
    {
        int reverse_s = 0;
        int r;
        while (number > 0) 
        {
            r = number % 10;
            number /= 10;
            reverse_s = reverse_s * 10 + r;
        }
        return reverse_s;
    }

    public static boolean isPalindrome(int number) 
    {
        return (number == reverse_number(number));
    }

    public static void selectionSort(double[] list) 
    {
        for (int i = 0; i < list.length - 1; i++) 
        {
            int in = i;
            for (int j = i + 1; j < list.length; j++) 
            {
                if (list[j] < list[in]) 
                {
                    in = j;
                }
            }

            if (in != i) 
            {
                double tmp = list[in];
                list[in] = list[i];
                list[i] = tmp;
            }
        }
    }

}