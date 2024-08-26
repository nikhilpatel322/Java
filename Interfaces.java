// Interface
interface Animal {
    void makeSound();
}

// Class implementing the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Main class
public class Interfaces {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Bark
    }
}
