
class Car {
    // Fields (attributes)
    String color;
    String model;
    int year;

    // Constructor
    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

// Main class
public class ClassObject {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);

        // Call the method to display car details
        myCar.displayDetails();
    }
}
