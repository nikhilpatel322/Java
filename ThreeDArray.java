public class ThreeDArray {
    public static void main(String[] args) {
        // Declare and initialize a 3D array
        int[][][] my3DArray = {
            { {1, 2, 3}, {4, 5, 6} },
            { {7, 8, 9}, {10, 11, 12} }
        };

        // Accessing elements of the 3D array
        System.out.println("Element at [0][1][2]: " + my3DArray[0][1][2]); // Prints 6
        System.out.println("Element at [1][0][1]: " + my3DArray[1][0][1]); // Prints 8
    }
}
