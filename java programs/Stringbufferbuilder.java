import java.util.*;
public class Stringbufferbuilder {
    public static void main(String[] args) {
        String s = "Rahul";//immutable
        s.concat(" Dev");
        String x =s.concat(" Dev");
        //System.out.println("s= "+x);
        StringBuffer s1 = new StringBuffer(s);//synchronized
        StringBuilder s2 = new StringBuilder(s);//non-synchronized
        //used for multiple threads
        s1.append(" Dev");
        //System.out.println("s= "+s1);
        //CharBuffer s3 = new CharBuffer(s);
        //char[] ch=s.toCharArray();  
        System.out.println(s.substring(4,5));

    }
}
