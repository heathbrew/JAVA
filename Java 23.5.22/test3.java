import java.util.*;
public class test3 {
    public static void main(String[] args){
        /*unchecked exception*/
        //Scanner sc =new Scanner(System.in);
        try{
            //int n = sc.nextInt();
           // int d = sc.nextInt();
            System.out.println(5/0);
        }
        catch(ArithmeticException e){
            System.out.println("you have entered zero");
        }
        finally{
            System.out.println("this is the end");
        }
    }
}
