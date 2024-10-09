import java.util.Scanner;

public class FactorialAnalysis {

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to analyze factorial: ");
        int n = scanner.nextInt();

        // Iterative approach
        long startTime = System.nanoTime();
        long iterativeResult = factorialIterative(n);
        long endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        // Recursive approach
        startTime = System.nanoTime();
        long recursiveResult = factorialRecursive(n);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        System.out.println("Factorial of " + n + " (Iterative): " + iterativeResult + ", Time taken: " + iterativeTime + " ns");
        System.out.println("Factorial of " + n + " (Recursive): " + recursiveResult + ", Time taken: " + recursiveTime + " ns");

        scanner.close();
    }
}
