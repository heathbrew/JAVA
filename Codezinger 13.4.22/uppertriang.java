import java.util.*;
public class uppertriang  
{  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //Initialize matrix a  
        int[][] arr = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
            arr[i][j] = sc.nextInt();
        }}  
        System.out.println("Input Matrix is ::\n");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");   
            }
            System.out.println();
        }  
          //Calculates number of rows and columns present in given matrix  
        int  rows = m;  
        int cols = n;  
          
        if(rows != cols){  
            System.out.println("Row and column should be same for Upper Triangular Matrix");  
        }  
        else {  
            //Performs required operation to convert given matrix into upper triangular matrix  
            System.out.printf("Upper Triangular Matrix is %n%n");  
            for(int i = 0; i < rows; i++){  
                for(int j = 0; j < cols; j++){  
                  if(i > j)  
                    System.out.print("0"+ "	");  
                  else  
                    System.out.print(arr[i][j] + "	");  
                }  
                System.out.println();  
            }  
        }  
    }  
}  