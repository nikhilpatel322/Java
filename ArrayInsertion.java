import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion {

    public static int[] insertAtFront(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        return newArr;
    }

    public static int[] insertAtPosition(int[] arr, int value, int position) {
        if (position < 0 || position > arr.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, position);
        newArr[position] = value;
        System.arraycopy(arr, position, newArr, position + 1, arr.length - position);
        return newArr;
    }

    public static int[] insertAtEnd(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = value;
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

        System.out.print("Enter the value to insert at the front: ");
        int frontValue = scanner.nextInt();
        int[] resultFront = insertAtFront(arr, frontValue);
        System.out.println("Array after inserting at front: " + Arrays.toString(resultFront));

        System.out.print("Enter the value to insert: ");
        int positionValue = scanner.nextInt();
        System.out.print("Enter the position to insert (0 to " + n + "): ");
        int position = scanner.nextInt();
        int[] resultAtPosition = insertAtPosition(arr, positionValue, position);
        System.out.println("Array after inserting at position " + position + ": " + Arrays.toString(resultAtPosition));

        System.out.print("Enter the value to insert at the end: ");
        int endValue = scanner.nextInt();
        int[] resultEnd = insertAtEnd(arr, endValue);
        System.out.println("Array after inserting at the end: " + Arrays.toString(resultEnd));

        scanner.close();
    }
}
