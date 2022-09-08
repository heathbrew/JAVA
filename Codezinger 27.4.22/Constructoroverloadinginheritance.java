class vehicle{
    String MakeYear;
    String type ;
    vehicle(){
        this.MakeYear ="2020";
        this.type = "Car";
    }
    vehicle(String make,String type){
        this.MakeYear = make;
        this.type = type;
    }
    void Display(){
        System.out.println(MakeYear);
        System.out.println(type);
    }
class car extends vehicle{
    String Model,Cost;
    car(String model,String cost,String MakeYear,String type){
        super(MakeYear,type);
        this.Model = model;
        this.Cost = cost;
    }
    void Display(){
        System.out.println(MakeYear);
        System.out.println(type);
        System.out.println(Model);
        System.out.println(Cost);
    }
}
class bike extends vehicle{
    String Model,Cost;
    bike(String model,String cost,String MakeYear,String type){
        super(MakeYear,type);
        this.Model = model;
        this.Cost = cost;
    }
    void Display(){
        System.out.println(MakeYear);
        System.out.println(type);
        System.out.println(Model);
        System.out.println(Cost);
    }
}
}
public class Constructoroverloadinginheritance {
    public static void main(String[] args){
        
    }
}
