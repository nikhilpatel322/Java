import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integer values
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println(""+num);

        // Reading float values
        System.out.print("Enter a float: ");
        float floatNum = scanner.nextFloat();
        System.out.println(""+floatNum);

        // Reading double values
        System.out.print("Enter a double: ");
        double doubleNum = scanner.nextDouble();
        System.out.println(""+doubleNum);

        // Reading string values
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.println(""+str);

        // Reading boolean values
        System.out.print("Enter a boolean (true/false): ");
        boolean bool = scanner.nextBoolean();
        System.out.println(""+bool);

        
    }
}