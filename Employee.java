import java.util.Date;

public class Employee extends Person 
{
    private int office;
    private double salary;
    private Date dateHired;

    public Employee()
    {
        super();
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary) 
    {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public void setOffice(int office) 
    {
        this.office = office;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public int getOffice() 
    {
        return office;
    }

    public double getSalary() 
    {
        return salary;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "Employee{" + "office='" + office + '\'' + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }
}