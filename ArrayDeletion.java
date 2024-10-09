import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {

    public static int[] deleteAtFront(int[] arr) {
        if (arr.length == 0) {
            return arr; // Return empty array if there's nothing to delete
        }
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, arr.length - 1);
        return newArr;
    }

    public static int[] deleteAtPosition(int[] arr, int position) {
        if (position < 0 || position >= arr.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, position);
        System.arraycopy(arr, position + 1, newArr, position, arr.length - position - 1);
        return newArr;
    }

    public static int[] deleteAtEnd(int[] arr) {
        if (arr.length == 0) {
            return arr; // Return empty array if there's nothing to delete
        }
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] resultFront = deleteAtFront(arr);
        System.out.println("Array after deleting at front: " + Arrays.toString(resultFront));

        System.out.print("Enter the position to delete (0 to " + (n - 1) + "): ");
        int position = scanner.nextInt();
        int[] resultAtPosition = deleteAtPosition(arr, position);
        System.out.println("Array after deleting at position " + position + ": " + Arrays.toString(resultAtPosition));

        int[] resultEnd = deleteAtEnd(arr);
        System.out.println("Array after deleting at the end: " + Arrays.toString(resultEnd));

        scanner.close();
    }
}
