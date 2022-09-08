//Read content from a file using FileInputStream
import java.io.*; 
public class Assingment2
{
    public static void main(String[] args)
    {
        File file = new File("Assingment1.txt");
 
        try (InputStream in = new FileInputStream(file))
        {
            int content;
            while ((content = in.read()) != -1) {
                System.out.print((char)content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}