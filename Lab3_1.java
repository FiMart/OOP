public class Lab3_1
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int x = 0; count < 100; x++)
        {
            if(isPrime(x) && isPalindrome(x))
            {
                System.out.printf("%10d", x);
                count++;

                if(count % 10 == 0 && x != 0)
                {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(long num)
    {
        if(num < 2)
        {
            return false;
        }
        for(int x = 2; x <= num / 2; x++)
        {
            if(num % x == 0)
            return false;
        }
        return true;
    }

    public static long reverse(long num)
    {
        long rev = 0;
        while(num != 0)
        {
            rev *= 10; // Ignore Loop
            rev += num % 10;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(long num)
    {
        return(num == reverse(num));
    }
}