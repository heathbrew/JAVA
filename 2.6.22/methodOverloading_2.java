public class methodOverloading_2 {
    public static void main(String[] args){
        /*
        within same class
        thre is no inheritance involved
        If a class has multiple methods having "same name" but "different in parameters",
        it is known as Method Overloading.
        */
    }
}
class NoofArg{
    public int add(int a , int b){return a + b;}
    public int add(int a , int b,int c){return a + b + c;}
    /*
    as we can see here in this program the only the no. of arguments
    are changing dispite the name being the same i.e "add"
    */
}
class DataTypes{  
    static int add(int a, int b){return a+b;}  
    static double add(double a, double b){return a+b;}
    //here the data types of the inputs are different  
    } 
//Q) Why Method Overloading is not possible by changing the return type of method only?
/*
method overloading is not possible by changing the return type of the method 
because of ambiguity
*/
class Ambiguity{  
    static int add(int a,int b){return a+b;}  
    static double add(int a,int b){return a+b;}
    //error produced
    //Duplicate method add(int, int) in type AmbiguityJava(67109219)
    //output
    //Compile Time Error: method add(int,int) is already defined in class ambiguity
    } 



//Can we overload java main() method?
/*
Yes, by method overloading. 
You can have any number of main methods in a class by method overloading. 
But JVM calls main() method which receives string array as argument.
*/
class mainmethodOverloading{  
    public static void main(String[] args){System.out.println("main with String[]");}  
    public static void main(String args){System.out.println("main with String");}  
    public static void main(){System.out.println("main without args");}  
    }