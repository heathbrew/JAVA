interface pen {
    public void write(); 
    public void refill(); 
  }
  class fountainpen implements pen {
    public void write() {
      System.out.println("pen");
    }
    public void refill() {
      System.out.println("write");
    }
    public void changenib(){
        System.out.println("nib changed");
    }
  }
public class ques2 {
    public static void main(String[] args) {
        fountainpen obj1 = new fountainpen();
        obj1.write();
        obj1.refill();
        obj1.changenib();
    }
}
