//a bunch of variables and methods that can be used to other classes.

abstract class Cat {
   
    public void meow () {
        System.out.println("Meow");
    }

    public abstract void poop();
}
//before you can actually use the abstract class 'cat' to the main method, you have to create another method which extends the class 'Cat'.
//you cannot call the abstract class directly to the main method.

class Siamese extends Cat {
    public void poop() {
        System.out.println("Dog Poop");
    }

}
//here we used the abstract class 'Cat' to our main method, but instead the 'Cat', we used the class 'Siamese'. 
public class abstract {
    public static void main(String[] args) {
        Siamese c = new Siamese();
        
        c.meow();
        c.poop();
    }

}
