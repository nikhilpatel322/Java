public class MatrixSum {
    public static void main(String[] args) {
        // Example 2D array (matrix)
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        // Calculate the sum of all elements in the matrix
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }

        System.out.println("Sum of elements in the matrix: " + sum);
    }
}
