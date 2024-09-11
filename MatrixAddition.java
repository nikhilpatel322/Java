import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get matrix dimensions from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        // Step 2: Read elements for the first matrix
        System.out.println("Enter the elements for the first matrix:");
        readMatrix(scanner, matrix1, rows, columns);

        // Step 3: Read elements for the second matrix
        System.out.println("Enter the elements for the second matrix:");
        readMatrix(scanner, matrix2, rows, columns);

        // Step 4: Perform matrix addition
        addMatrices(matrix1, matrix2, resultMatrix, rows, columns);

        // Step 5: Display the result
        System.out.println("Resultant matrix after addition:");
        displayMatrix(resultMatrix, rows, columns);
    }

    // Method to read matrix elements
    private static void readMatrix(Scanner scanner, int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    private static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
