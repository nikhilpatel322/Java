import java.util.Scanner;

public class TwoDArrayEXAMPLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the 2D array
        int[][] arr = new int[rows][columns];

        // Input elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Display the array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

     
    }
}
