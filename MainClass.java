class Animal {
    final void eat() {
        System.out.println("Animal eats");
    }
    
    void move() {
        System.out.println("Animal moves");
    }
}

class Dog extends Animal {
    void move() {
        super.move();
        System.out.println("Dog moves");
    }
    
    void bark() {
        System.out.println("Dog barks");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        myDog.eat();
        myDog.move();
        myDog.bark();
    }
}
