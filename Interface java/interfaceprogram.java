interface printable{  
    void print();  
    }  
    public class interfaceprogram implements printable{  
    public void print()
    {System.out.println("Hello");}  
      
    public static void main(String[] args){  
        interfaceprogram obj = new interfaceprogram();  
    obj.print();  
     }  
    }