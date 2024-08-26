// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Main class
public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Bark
        myDog.sleep();     // Outputs: Zzz
    }
}
