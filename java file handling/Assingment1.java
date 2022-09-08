// write content into a file using File Output Stream
import java.io.*;
import java.util.*;
public class Assingment1{
    public static void main(String[] args)throws FileNotFoundException, IOException {
        String fileName = "Assingment1.txt";
        Scanner sc = new Scanner(System.in);
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            
            String text = sc.nextLine();
            byte[] mybytes = text.getBytes();
            
            fos.write(mybytes);
    }
}}