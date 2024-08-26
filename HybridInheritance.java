interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("I can eat");
    }

    public void play() {
        System.out.println("I can play");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Method from Animal interface
        myDog.play(); // Method from Pet interface
    }
}
