import java.util.*;
public class togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer (sc.nextLine());
        StringBuffer tc = new StringBuffer ("");
        for (int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
        if(ch.isUpperCase()){
        tc.append(ch.toLowerCase());
        }
        else if(ch.isLowerCase()){
        tc.append(ch.toUpperCase());
        }}
System.out.println(tc);
            }
            }