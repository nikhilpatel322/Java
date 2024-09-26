import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(10) + 1;  // Random number between 1 and 10
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessed = false;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 10.");
        
        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < 1 || guess > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            } else if (guess == numberToGuess) {
                hasGuessed = true;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        scanner.close();
    }
}
