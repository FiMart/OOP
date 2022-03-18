public class Staff extends Employee 
{
    private String title;

    public Staff() 
    {
        super();
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, int office, double salary, String title) 
    {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "Staff{" + "title='" + title + '\'' + '}';
    }
}