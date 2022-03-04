public class Lab6_2
{
    public static void main(String[] args)
    {
        Course course = new Course();
        course.addStudent("A");
        course.addStudent("B");
        course.addStudent("C");
        course.dropStudent("B");
        course.getStudentName();
    }
}