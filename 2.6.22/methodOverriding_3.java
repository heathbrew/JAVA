public class methodOverriding_3 {
    public static void main(String[] args){
        /*
        If subclass (child class) has the same method as declared in the parent class, 
        it is known as method overriding in Java.
        */
        Bike2 obj = new Bike2();//creating object  
        obj.run();//calling method
        /////////////////////////////////////////////////////////////////////////////
        SBI s=new SBI();  
        ICICI i=new ICICI();  
        AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
    }
}
/*
Rules for method overriding
//the method in the parent class must have the same ________ in the child class
1.same name 
2. same parameters
*/
//Creating a parent class.  
class Vehicle{  
    //defining a method  
    void run(){System.out.println("Vehicle is running");}  
  }  
  //Creating a child class  
  class Bike2 extends Vehicle{  
    //defining the same method as in the parent class  
    void run(){System.out.println("Bike is running safely");}    
  }  

  /*
A real example of Java Method Overriding
Consider a scenario where Bank is a class that provides functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
  */
  class Bank{  
    int getRateOfInterest(){return 0;}  
    }  
    //Creating child classes.  
    class SBI extends Bank{  
    int getRateOfInterest(){return 8;}  
    }  
      
    class ICICI extends Bank{  
    int getRateOfInterest(){return 7;}  
    }  
    class AXIS extends Bank{  
    int getRateOfInterest(){return 9;}  
    }  