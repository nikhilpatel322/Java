import java.util.Scanner;

public class TryMathCube {

    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        try {
            int num = Integer.parseInt(scanner.nextLine());
            int result = cube(num);
            System.out.println("Cube of " + num + " is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input. Please enter a valid number.");
        }
    }
}
