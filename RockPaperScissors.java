import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, Scissors). To quit the game, type 'quit':");

        while (true) {
            System.out.print("Your choice: ");
            String playerChoice = scanner.nextLine().trim();

            if (playerChoice.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            if (!playerChoice.equalsIgnoreCase("Rock") && 
                !playerChoice.equalsIgnoreCase("Paper") && 
                !playerChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            String computerChoice = choices[random.nextInt(3)];

            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors") ||
                       playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock") ||
                       playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println();
        }
        
        scanner.close();
    }
}
