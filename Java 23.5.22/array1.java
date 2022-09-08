public class array1{
    public static void main(String[]args){
           try{
                int a[]=new int[5];
                a[5]=30/0;
               }
               catch(Exception  e)
                  {
                   System.out.println("Parent Exception occurs");
                  }
        /*
               catch(ArithmeticException e)
                  {
                   System.out.println("Arithmetic Exception occurs");
                  }
               catch(ArrayIndexOutOfBoundsException e)
                  {
                   System.out.println("ArrayIndexOutOf Bounds Exception occurs");
                  }
                  */
            finally{
               System.out.println("rest of the code");}
   }}