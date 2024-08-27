import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.print("Enter your favorite programming language: ");
        String language = scanner.next(); 

        // Display the input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("Your favorite programming language is " + language);

       
    }
}
