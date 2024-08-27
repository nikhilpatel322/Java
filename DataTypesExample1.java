public class DataTypesExample1 {
    public static void main(String[] args) {
        // Primitive data types
        int age = 30;
        double pi = 3.14;
        char grade = 'A';
        boolean isJavaFun = true;

        // Reference data types
        String message = "Hello, World!";
        int[] numbers = {1, 2, 3};
        MyClass myObject = new MyClass();

        // Display the data
        System.out.println("Age: " + age);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Message: " + message);
        System.out.println("Number at index 1: " + numbers[1]);
        System.out.println("My object: " + myObject);

        
    }
}

class MyClass {
    // Custom user-defined clas
}
