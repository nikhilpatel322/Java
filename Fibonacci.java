import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1; 
        System.out.print("Fibonacci sequence: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); 
            int nextTerm = a + b; 
            a = b; 
            b = nextTerm; 
        }
        
        System.out.println(); 
        scanner.close();
    }
}
