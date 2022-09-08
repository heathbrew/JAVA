import java.util.*;
class Employee{
    int EmpId;
    int Salary;
    String Name;
    String Address;
    String Department;
    void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }
    int getEmpId() {
        return EmpId;
    }
    void setSalary(int Salary) {
        this.Salary = Salary;
    }
    int getSalary() {
        return Salary;
    }
    void setName(String Name) {
        this.Name = Name;
    }
    String getName() {
        return Name;
    }
    void setAddress(String Address) {
        this.Address = Address;
    }
    String getAddress() {
        return Address;
    }
    void setDepartment(String Department) {
        this.Department = Department;
    }
    String getDepartment() {
        return Department;
    }

}
  public class Employeesmthodoverriding{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          Employee e = new Employee();
          e.setEmpId(sc.nextInt());
          e.setName(sc.next());
          
          e.setAddress(sc.next());
          e.setSalary(sc.nextInt());
          e.setDepartment(sc.next());
        System.out.println("Employee [Emp ID = "+e.getEmpId()+", Salary = "+e.getSalary()+", Name = "+e.getName()+", Address = "+e.getDepartment()+", Department = "+e.getAddress());

          if (e.getSalary() >=1000 && e.getSalary() <=1500){
              System.out.println("");
              System.out.println(" Salary is incremented ");
            int newsal = e.getSalary()*5/100;
            e.setSalary(e.getSalary()+newsal);
          }
          else if (e.getSalary() >=1500 && e.getSalary() <=20000){
                 System.out.println("");
              System.out.println(" Salary is incremented ");
            int newsal = e.getSalary()*10/100;
            e.setSalary(e.getSalary()+newsal);
          }
          System.out.println("");
        System.out.println("Employee [Emp ID = "+e.getEmpId()+", Salary = "+e.getSalary()+", Name = "+e.getName()+", Address = "+e.getDepartment()+", Department = "+e.getAddress());
           
      }
  }