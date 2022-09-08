//get absolute paths and size (in bytes) of a give file
import java.io.*;
public class Assingment3 {
    public static void main(String args[]) {
        final String fileName = "Assingment1.txt";
        try {
            // File Object
            File objFile = new File(fileName);

            // getting file path
            System.out.println("File path is: " + objFile.getAbsolutePath());
            // getting filesize
            System.out.println("File size is: " + objFile.length() + " bytes.");
        } catch (Exception Ex) {
            System.out.println("Exception: " + Ex.toString());
        }

    }
}
