public class Lab7_3 
{
    public static void main(String args[]) 
    {
        Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", Student.FRESHMAN);
        System.out.println("Student");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Email: " + student.getEmailAddress());
        System.out.println(student.toString());

        System.out.println();
        Staff staff = new Staff("Staff", "Address staff", "012-345-6789", "email Of staff", 1122, 20000.00, "title");
        System.out.println("Staff");
        System.out.println(staff.toString());

        System.out.println();
        Faculty faculty = new Faculty("Faculty", "Address faculty", "012-345-6789", "email of faculty", 1122, 20000.00, "3pm to 6pm", "Professor");
        System.out.println("Faculty");
        System.out.println(faculty.toString());

        System.out.println();
        Employee employee = new Employee("Employee", "Address employee", "012-345-6789", "email of employee", 1122, 3000.00);
        System.out.println("Employee");
        System.out.println(employee.toString());

        System.out.println();
        Person person = new Person("Person", "Address person", "012-345-6789", "email of person");
        System.out.println("Person");
        System.out.println(person.toString());
    }
}