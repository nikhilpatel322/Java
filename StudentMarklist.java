import java.util.Scanner;

public class StudentMarklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
         ////arrays
        String[] names = new String[n];
        int[] rollNumbers = new int[n];
        double[] marks = new double[n];
        /////input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.next();
            System.out.print("Roll Number: ");
            rollNumbers[i] = scanner.nextInt();
            System.out.print("Marks: ");
            marks[i] = scanner.nextDouble();
        }

        // Display 
        System.out.println("\nStudent Marklist:");
     
        System.out.println("Name\tRoll Number\tMarks");
       
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t" + rollNumbers[i] + "\t\t" + marks[i]);
        }
        
    }
}
