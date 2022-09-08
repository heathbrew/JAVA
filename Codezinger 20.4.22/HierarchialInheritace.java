import java.util.*;
class Teacher{
    static void teach(String sub){
        System.out.printf("Teacher is teaching %s%n",sub);
    }
}
class Principal extends Teacher{
    static void listens(String sub){
    System.out.printf("Principal is taking care of both %s teacher and student%n",sub);
    }
}
class student extends Teacher{
    static void evaluate(String sub){
    System.out.printf("Students are studying %s",sub);
    }
}
public class HierarchialInheritace{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sub = sc.next();
    Teacher t = new Teacher();
    Principal p = new Principal();
    student s = new student();
    Principal.listens(sub);
    Teacher.teach(sub);
    student.evaluate(sub);

    }
}