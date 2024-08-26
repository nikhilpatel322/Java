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

class Cat extends Animal {
    void meow() {
        System.out.println("I can meow");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        myDog.eat();  // Method from Animal class
        myDog.bark(); // Method from Dog class
        
        myCat.eat();  // Method from Animal class
        myCat.meow(); // Method from Cat class
    }
}
