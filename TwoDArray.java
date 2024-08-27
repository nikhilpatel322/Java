public class TwoDArray{
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] Numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Accessing elements of the 2D array
        System.out.println("Element at row 1, column 2: " + Numbers[0][1]); // Prints 2
        System.out.println("Element at row 2, column 3: " + Numbers[1][2]); // Prints 7
        System.out.println("Element at row 3, column 0: " + Numbers[2][0]); // Prints 9
    }
}
