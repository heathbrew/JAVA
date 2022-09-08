import java.util.*;
class multidimarray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        System.out.println("Input Matrix is ::\n");
        int[][] arr=new int[m][n];
        int sum=0;
        int sumr=0;
        int sumc=0;
        int sum2=0;
        for(int m1=0;m1<m;m1++){
            for(int n1=0;n1<n;n1++){
                arr[m1][n1]=s.nextInt();
            }}
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");   
            }
            System.out.println();
        }
        if(n!=m){System.out.print("Matrix should be of size NxN");}
        else{
        //sum of row
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        sumr=sumr+arr[i][j];
        }
            System.out.println("Sum of row "+i+" is "+sumr);
            sumr=0;
        }
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        sumc=sumc+arr[j][i];
        }
        System.out.println("Sum of column "+i+" is "+sumc);
            sumc=0;
        }
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        if(i==j){
            sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum of first diagonal is "+sum);
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        if((i+j)==(n-1)){
            sum2=sum2+arr[i][j];
                }
            }
        }
        System.out.println("Sum of second diagonal is "+sum2);

        }
    }
}