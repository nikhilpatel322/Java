public class ControlStatementss {
    public static void main(String[] args) {
        ////// if statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }

        ////// switch statement
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Average.");
                break;
            default:
                System.out.println("Needs improvement.");
        }

        ////// while loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        ////// for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}
