interface pen {
    public void write(); 
    public void refill(); 
  }
  class Drivermain implements pen {
    public void write() {
      System.out.println("pen");
    }
    public void refill() {
      System.out.println("write");
    }
  }
public class ques1 {
    public static void main(String[] args) {
        Drivermain obj1 = new Drivermain();
        obj1.write();
        obj1.refill();
    }
}
