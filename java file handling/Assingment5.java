//find the longest word in the text file
import java.util.*;
import java.io.*;
public class Assingment5 {
     public static void main(String [ ] args) throws FileNotFoundException {
              new Assingment5().findLongestWords();
         }
     public String findLongestWords() throws FileNotFoundException {
       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("Assingment1.txt"));
       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }
       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}
