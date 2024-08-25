public class ArrayImplementation{
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        // sum of the elements of array
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of the elements: " + sum);

        //  maximum element of array
        int max = numbers[0];
        for (int i = 1; i < 5 ; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
