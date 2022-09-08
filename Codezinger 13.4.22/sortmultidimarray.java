import java.util.*;
public class sortmultidimarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
            arr[i][j] = sc.nextInt();
        }}
        int temp[] = new int[m * n];
        int k = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                temp[k++] = arr[i][j];
        Arrays.sort(temp);
         k = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = temp[k++];
        System.out.printf("Matrix is ::%n");
        for (int i=0;i<m;i++){
            System.out.println();
            for (int j=0;j<n;j++){
            System.out.print( arr[i][j] +"	");
            
    }}}}
