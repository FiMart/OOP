public class Lab1_1 
{
    public static void main(String[] args) 
    {
        long population = 312032486; // All population
        int birth = 4505142; // (365 *24 *60 *60)/7 == 4505142
        int death = 2425846; // (365 *24 *60 *60)/13 == 2425846
        int immigrant = 700800; // (365 *24 *60 *60)/45 == 700800

        //Population Year 1
        population = population + birth + immigrant - death;
        System.out.println("Population Year 1 = "+ population);

        //Population Year 2
        population = population + birth + immigrant - death;
        System.out.println("Population Year 2 = "+ population);

        //Population Year 3
        population = population + birth + immigrant - death;
        System.out.println("Population Year 3 = "+ population);

        //Population Year 4
        population = population + birth + immigrant - death;
        System.out.println("Population Year 4 = "+ population);

        //Population Year 5
        population = population + birth + immigrant - death;
        System.out.println("Population Year 5 = "+ population);

    }
}
