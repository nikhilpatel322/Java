import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = scanner.nextLine(); 

        if (input.length() == 1) {
            char inputChar = input.charAt(0);

            if (Character.isLetter(inputChar)) {
                char lowercaseChar = Character.toLowerCase(inputChar); 

                if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' ||
                    lowercaseChar == 'o' || lowercaseChar == 'u') {
                    System.out.println("It's a vowel.");
                } else {
                    System.out.println("It's a consonant.");
                }
            } else {
                System.out.println("Invalid input. Please enter a single letter.");
            }
        } else {
            System.out.println("Invalid input. Please enter exactly one character.");
        }
    }
}
