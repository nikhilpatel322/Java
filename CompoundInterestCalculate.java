import java.util.Scanner;

public class CompoundInterestCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (in INR): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double rateOfInterest = scanner.nextDouble() / 100; // Convert percentage to decimal

        System.out.print("Enter the time period (in years): ");
        double timeInYears = scanner.nextDouble();

        double compoundInterest = principal * Math.pow(1 + rateOfInterest, timeInYears);

        ////// Display the result
        System.out.println("\nCompound Interest:");
        System.out.println("Principal Amount: " + principal + " INR");
        System.out.println("Annual Interest Rate: " + (rateOfInterest * 100) + "%");
        System.out.println("Time Period: " + timeInYears + " years");
        System.out.println("Compound Interest: " + compoundInterest + " INR");

        scanner.close();
    }
}
