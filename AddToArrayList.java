import java.util.ArrayList;
import java.util.Scanner;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("No of  elements: ");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            list.add(element);
        }

        System.out.println("\nThe elements in the ArrayList are: " + list);

    }
}
