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

class Puppy extends Dog {
    void weep() {
        System.out.println("I can weep");
    }
}

public class MultiLvlInheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // Method from Animal class
        myPuppy.bark(); // Method from Dog class
        myPuppy.weep(); // Method from Puppy class
    }
}
