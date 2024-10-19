import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the product: ");
        double originalPrice = scanner.nextDouble();

        System.out.println("Select discount type: ");
        System.out.println("A: 10% discount");
        System.out.println("B: 15% discount");
        System.out.println("C: 20% discount");
        System.out.println("D: No discount");
        System.out.print("Enter your choice (A, B, C, or D): ");
        char discountType = scanner.next().toUpperCase().charAt(0);

        double finalPrice = originalPrice;

        switch (discountType) {
            case 'A':
                finalPrice = originalPrice * 0.90;
                break;
            case 'B':
                finalPrice = originalPrice * 0.85;
                break;
            case 'C':
                finalPrice = originalPrice * 0.80;
                break;
            case 'D':
                break;
            default:
                System.out.println("Invalid discount type entered. Program will terminate.");
                System.exit(0);
        }

        System.out.printf("The final price after discount is: $%.2f%n", finalPrice);

        scanner.close();
    }
}
