import java.util.GregorianCalendar;

public class Lab4_2
{
    public static void main(String[] args) 
    {
        GregorianCalendar gre_Cal = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + gre_Cal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gre_Cal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gre_Cal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gre_Cal.get(GregorianCalendar.DAY_OF_WEEK));

        System.out.println("------------");

        System.out.println("After specified the elapsed time of one day after current day");
        gre_Cal.add(GregorianCalendar.DATE,1);
        System.out.println("Year is " + gre_Cal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gre_Cal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gre_Cal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gre_Cal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(gre_Cal.getTime());
    }
}