import java.util.*;
class getArea{
    static void area (int x){
        System.out.printf("Area (Square): %d%n",x*x);
    }
    static void area (int x, int y){
        System.out.printf("Area (Rectangle): %d%n",x*y);
    }
}
class Calculate extends getArea{
    static void area (int x){
        System.out.println("Area of Circle (Derived Class): "+(3.14f*x*x));
    }
}
public class CalculateArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        getArea a = new getArea();
        a.area(x);
        a.area(x, y);
        Calculate c = new Calculate();
        c.area(x);
    }
}
