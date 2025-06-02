import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;  // Score for rounds won

        while (true) {
            Random number = new Random();
            int numbergenerated = number.nextInt(100) + 1;  // Generates number between 1 and 100
            int attempts = 5;
            boolean correct = false;

            System.out.println("\nNew Round! Try to guess the number between 1 and 100.");

            for (int i = 0; i < attempts; i++) {
                System.out.print("Attempt " + (i + 1) + "/" + attempts + ": Your guess: ");
                int playerguess = scanner.nextInt();

                if (playerguess == numbergenerated) {
                    System.out.println("🎉 Congratulations! You got it!");
                    score++;  // Increment score when guessed correctly
                    correct = true;
                    break;
                } else if (playerguess > numbergenerated) {
                    System.out.println("Too high! Try again ☹️");
                } else {
                    System.out.println("Too low! Try again ☹️");
                }
            }

            if (!correct) {
                System.out.println("Game Over! The correct number was " + numbergenerated);
            }

            System.out.println("Current Score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("\nThanks for playing! 🎯 Final Score: " + score);
                break;
            }
        }
        
        scanner.close();
    }
}
