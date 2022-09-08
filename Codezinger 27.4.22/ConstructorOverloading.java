import java.util.*;
class volume{
    volume(double x, double y, double z){
System.out.println("Volume of first shape with 3 arguments is "+x*y*z);
    }
    volume(double x){
    System.out.println("Volume of third shape with 1 argument is "+x*x*x);
    }
    volume(){
        System.out.println("Volume of second shape with no argument is -1.0");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    volume v1 = new volume(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
    volume v2 = new volume();
    volume v3 = new volume(sc.nextDouble());
    }
}