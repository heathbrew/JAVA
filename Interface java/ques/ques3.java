class monkey {
    protected String species = "Animal";        // Vehicle attribute
    public void jump() {                    // Vehicle method
      System.out.println("Hop");
    }
    public void bite(){
        System.out.println("bite");
    }
  }
  class human extends monkey {
    protected String Newspecies = "human"; 
    public void eat() {
        System.out.println("cooked stuff");
    }
    public void sleep() {
        System.out.println("Countineous 8hrs");
    }
  }
  public class ques3{
    public static void main(String[] args) {
      human h1 = new human();
      h1.jump();
      h1.bite();
      h1.eat();
      h1.sleep();
      System.out.println(h1.species + " Type " + h1.Newspecies);
    }
  }