public class ArraySum {
    public static void main(String[] args) {
        // Example integer array
        int[] Array = { 10, 20, 30, 40, 50 };

        // Calculate sum using enhanced for loop
        int sumEnhanced = 0;
        for (int num : Array) {
            sumEnhanced += num;
        }
        System.out.println("Sum using enhanced for loop: " + sumEnhanced);

        // Calculate sum using traditional for loop
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        System.out.println("Sum using traditional for loop: " + sum);
    }
}
