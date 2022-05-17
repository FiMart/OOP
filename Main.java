public class Main
{
    /*Main Method*/
    public static void main(String[] args) 
    {
        Movie Marvel = new Marvel("Avengers: Endgame", "Anthony and Joe Russo", 287000000, 99999,89999,10000);
        Marvel.watch();
        Marvel.comment(true);
        Marvel.calculateRating();
        System.out.println(Marvel.toString());
        Marvel.movieOut(1,"May",2019);

        Movie DC = new DC("The Suicide Squad", "James Gunn", 150000000, 79999, 40000, 39999);
        DC.watch();
        DC.comment(false);
        DC.calculateRating();
        System.out.println(DC.toString());
        DC.movieOut(8,"August",2021);
    }
}