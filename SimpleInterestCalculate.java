import java.util.Scanner;

public class SimpleInterestCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (in INR): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double timeInYears = scanner.nextDouble();

        double simpleInterest = (principal * rateOfInterest * timeInYears) / 100;

        ////// Display
        System.out.println("\nSimple Interest:");
        System.out.println("Principal Amount: " + principal + " INR");
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Time Period: " + timeInYears + " years");
        System.out.println("Simple Interest: " + simpleInterest + " INR");

    }
}
