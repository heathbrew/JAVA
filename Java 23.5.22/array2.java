import java.util.*;
/*user defined exception*/
class User extends Exception{
    User(String s){
        super(s);
    }
}
public class array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int a[] = new int[5];
            int x= sc.nextInt();
            if(x>4 || x<0){
                throw new User("out of bound");
            }
            a[x]=30;
        }
        catch(User u){
            System.out.println(u.getMessage());
        }
        
    }
}
