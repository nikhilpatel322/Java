class Car {
    String model;
    int year;

    // Constructor version
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // No constructor version
    public Car() {}

    public void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class Mainn{
    public static void main(String[] args) {
        // Using the constructor
        Car myCar1 = new Car("Toyota Corolla", 2022);
        myCar1.displayDetails();

        // Without using the constructor
        Car myCar2 = new Car();
        myCar2.setDetails("Honda Civic", 2021);
        myCar2.displayDetails();
    }
}
