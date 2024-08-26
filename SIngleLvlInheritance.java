class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

public class SIngleLvlInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Method from Animal class
        myDog.bark(); // Method from Dog class
    }
}
