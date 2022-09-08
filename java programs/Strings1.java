public class Strings1 {
public static void main(String[] args){
    String A = "hello";
    char[] arrsample = {'R','O','S','E'};
    //use single quotes instaed of double quotes
    //since it gives an error
    String strSample_1 = new String (arrsample);
    //ROSE
    String name = "Joe Bloggs";
    int x = 3;
    int y = 5;
    String point = "(" + x +","+y+ ")";
    //(3,5)
    String str1 = "Rock";
    String str2 = "Star";
    String str3 = str1.concat(str2);
    String a = "no";
    if(str3.equals(str1+str2)){
        a="yes";
    }////prints no ???
    String name1 = "Joe Bloggs";
    int length = name1.length();
    //10
    char At = (name1.toString()).charAt(0);
    //J
//.equals
//.indexOf
//String[] result = text.split(" ");
//for (String str : result){sop(str+", ");}
//String.contains(string);
//true or false
//String.endsWith("r");
//String.endsWith("tar");
//true or false
//replace
//String.replace("Rock","Duke");
//replaceALL
//replaceFirst
String name2 = "Joe Bloggs";
String[] list1= name2.split(" ");
//System.out.println(String.join(",",list1));
String name3 = "     Joe         Bloggs                                         ";
System.out.println(name3.trim());

//System.out.println();
}
}
