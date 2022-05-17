import java.util.Date;
public class DC extends Movie
{
    private Date dateCreated;
    private double amountIncome;
    private String director;
    private String name;
    
    // Constructor
    public DC()
    {
        dateCreated = new Date();
    }
    

    public DC(String name,String director,double amountIncome,int view,int like,int dislike)
    {
        super(view, like, dislike);
        this.amountIncome = amountIncome;
        this.name = name;
        this.director = director;
        dateCreated = new Date();
    }

    // Accessors
    public Date getdateCreated() 
    {
        return this.dateCreated;
    }

    // Mutator
    public void setdateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

    public double getAmountIncome() 
    {
        return this.amountIncome;
    }

    public void setAmountIncome(double amountIncome) 
    {
        this.amountIncome = amountIncome;
    }

    public String getDirector() 
    {
        return this.director;
    }

    public void setDirector(String director) 
    {
        this.director = director;
    }

    public String getNameOfmovie() 
    {
        return this.name;
    }

    public void setNameofmovie(String name) 
    {
        this.name = name;
    }

    @Override
    public String movieOut(int day,String month,int year) 
    {            
        return day + " " + month + " " + year;
    }

    @Override
    public String nationalityOfmovie(String nationality) 
    {
        return nationality;
    }

    @Override
    public String toString() 
    {
        return "\nName = " + getNameOfmovie() + "\nDataCreate :" + getdateCreated() + "\n" +super.toString();
    }
    
}
