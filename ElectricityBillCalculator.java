import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total KWh units consumed: ");
        double unitsConsumed = sc.nextDouble();

        double billAmount;
        if (unitsConsumed >= 1 && unitsConsumed <= 100) {
            billAmount = unitsConsumed * 10;
        } else if (unitsConsumed > 100 && unitsConsumed <= 200) {
            billAmount = 1000 + (unitsConsumed - 100) * 15;
        } else if (unitsConsumed > 200 && unitsConsumed <= 300) {
            billAmount = 2500 + (unitsConsumed - 200) * 20;
        } else {
            billAmount = 4500 + (unitsConsumed - 300) * 25;
        }

        System.out.println("Total amount due: Rs. " + billAmount);
    }
}
