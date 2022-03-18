public class Student extends Person 
{
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;
    private int status;

    public Student() 
    {
        super();
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, int status) 
    {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public void setStatus(int status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        if(status == 1) {
            return "FRESHMAN";
        }
        else if (status == 2) 
        {
            return "SOPHOMORE";
        }
        else if (status == 3) 
        {
            return "JUNIOR";
        }
        else if (status == 4) 
        {
            return "SENIOR";
        }
        return "";
    }

    @Override
    public String toString() 
    {
        return super.toString() + "Student{" + "status=" + getStatus() + '}';
    }
}