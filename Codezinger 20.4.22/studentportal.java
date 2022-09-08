import java.util.*;
class StudentPersonal
{     
    void details (String name, String fname, long num)
    {
        System.out.println( "Name is "+name);
        System.out.println("Father's Name is "+fname);
         System.out.println("Contact number "+num);
    }
}    
class StudentEdu extends StudentPersonal
{
    void details(int rolln, int age)
    {
          System.out.println("Roll No-"+rolln);
          System.out.println("Age-"+age);
     }     
}
public class studentportal
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
      String name = s.next();
      String fname = s.next();
      long num = s.nextLong ();
      int rolln = s.nextInt ();
      int age = s.nextInt () ;
      StudentEdu stu = new StudentEdu();
      stu.details (name, fname, num);
      stu.details(rolln, age);
     }
}