// Class with encapsulated data
class Person {
    // Private data members
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Adding validation
            this.age = age;
        }
    }
}

// Main class to test encapsulation
public class Encapsulations {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();
        
        // Setting values using setter methods
        person.setName("Nikhil");
        person.setAge(21);
        
        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
