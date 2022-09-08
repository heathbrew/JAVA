import java.utils.*;
public class newsort01{
public static void main(String[] args)
    {
        Segregate seg = new Segregate();
        int arr[] = new int[]{0,1,0,1,0,1,0,0,1,0,0,1,1,0,0,0,1,1,1,1};
        int i, arr_size = arr.length;
 
        seg.segregate0and1(arr, arr_size);
 
        System.out.print("Array after segregation is ");
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
    }
}