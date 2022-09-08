public class test4 {
    public static void main(String[] args){
        /*execution of finally even when there is an error but is not caught*/
        try{
            System.out.println("start");
            int a[]=new int[5];
                a[5]=30/2;
        }
        catch(ArithmeticException e){
            System.out.println("error");
        }
        finally{
            System.out.println("end");
        }
    }
}
