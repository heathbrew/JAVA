import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       if (N>=0&&M<=100){
         System.out.printf(N+" "+M);
       }
      
    }
  }