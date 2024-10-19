import java.util.Scanner;

public class AdmissionEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistryMarks = scanner.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int mathMarks = scanner.nextInt();

        int totalMarks = physicsMarks + chemistryMarks + mathMarks;

        if (physicsMarks >= 60) {
            if (chemistryMarks >= 60) {
                if (mathMarks >= 70) {
                    if (totalMarks >= 200) {
                        System.out.println("The candidate is eligible for admission.");
                    } else {
                        System.out.println("The candidate is not eligible: Total marks less than 200.");
                    }
                } else {
                    System.out.println("The candidate is not eligible: Marks in Mathematics less than 70.");
                }
            } else {
                System.out.println("The candidate is not eligible: Marks in Chemistry less than 60.");
            }
        } else {
            System.out.println("The candidate is not eligible: Marks in Physics less than 60.");
        }

        scanner.close();
    }
}
