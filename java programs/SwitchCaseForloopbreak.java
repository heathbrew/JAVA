import java.util.*;
public class SwitchCaseForloopbreak {
    public static void main(String[] args){
Scanner s = new Scanner(System.in) ;
String City = s.nextLine ();
String[] Delhi = {"India Gate", "Lal Kila", "Humayun 's Tomb",
"Qutub Minar", "Red Fort"};
String[] Agra = {"Taj mahal", "Agra Fort", "Fatehpur Sikri"};
String[] Lucknow = {"Bara Imambara", "British Residency",
                        "Rumi Darwaza "};
String[] Amritsar = {"Golden Temple", "Company Bagh",
"Jallianwalan Bagh"};
switch (City){
default:
System.out.println("Taj Mahal");
break;
    case "Delhi" :
    for(int i = 0;i<Delhi.length; i++){
    System.out.println(Delhi[i]);}
    break;
    case "Agra":
    for (int i = 0;i<Agra.length; i++){
    System.out.println(Agra[i]);}
    break;
    case "Lucknow":
    for (int i = 0;i<Lucknow.length; i++){
    System.out.println(Lucknow[i]);}
    break;
    case "Amritsar":
    for (int i = 0;i<Amritsar.length; i++){
    System.out.println(Amritsar [i]);}
    break;

    }
}}
