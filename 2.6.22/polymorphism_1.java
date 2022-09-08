public class polymorphism_1{
    public static void main (String[] args) {
        /*
        Poly - many
        morphism - forms
        Polymorphism is used inherit functions from parent class 
        which are then used in child classes to do different tasks
        */
        Dog d = new Dog();
        d.animalSound();
        Cat c = new Cat();
        c.animalSound();
        

    }
}
class Animal{
    public void animalSound(){
        System.out.println("this is the sound");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("bhao bhao");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("meow meow");
    }
}
/*
in the following program the function animal sound is used to print 
different animal sounds.
*/