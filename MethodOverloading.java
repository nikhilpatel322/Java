class MathOperations {
    // Method to multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply two doubles
    double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.multiply(2, 3));        // Outputs: 6
        System.out.println(math.multiply(2, 3, 4));     // Outputs: 24
        System.out.println(math.multiply(2.5, 3.5));    // Outputs: 8.75
    }
}
