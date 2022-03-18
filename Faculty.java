public class Faculty extends Employee
{
    private String officeHour;
    private String rank;

    public Faculty() 
    {
        super();
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, int office, double salary, String officeHour, String rank) 
    {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public void setOfficeHour(String officeHour) 
    {
        this.officeHour = officeHour;
    }

    public void setRank(String rank) 
    {
        this.rank = rank;
    }

    public String getOfficeHour() 
    {
        return officeHour;
    }

    public String getRank() 
    {
        return rank;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "Faculy{" + "officeHour='" + officeHour + '\'' + ", rank='" + rank + '\'' + '}';
    }
}