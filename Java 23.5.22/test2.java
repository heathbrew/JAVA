public class test2 {
    public static void main(String[] args){

        /*finnaly is always is excuted even when catch is not*/
        try{
            System.out.println("no error");
        }
        catch(Exception e){
            System.out.println("catch used");
        }
        finally{
            System.out.println("this is the end");
        }
    }
}
