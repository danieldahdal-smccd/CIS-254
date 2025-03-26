/**
 *Games using Random Generator
 * @author Min Htet Khant (Rock Paper Scissor)
 * @author Daniel Dahdal (Guessing Game)
 * @since 25/03/2025
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    /**This is the Guessing Game.*/
        public static void playGame1() {
            Random random = new Random();
            int number = random.nextInt(100);

            Scanner input = new Scanner(System.in);
            int tryCount = 0;

            System.out.println("Guess the number: ");

            while (tryCount < 5) {
                tryCount++;
                int guessedNumber = input.nextInt();

                if (guessedNumber != number) {
                    if (guessedNumber > number) {
                        System.out.println("You guessed higher.");
                    } else {
                        System.out.println("You guessed lower.");
                    }

                    if (tryCount == 5) {
                        System.out.println(" The number was " + number + ".");
                    }
                } else {
                    tryCount = 5;
                    System.out.println("You got it! The number is " + number + ".");
                }
            }
        }

        /**This is the Rock-Paper-Scissors Game.*/
        public static void playGame2() {
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);

            int computerChoice = rand.nextInt(3) + 1;

            System.out.print("Enter your choice: 1. paper, 2. scissors, 3. rock: ");
            int userChoice = scanner.nextInt();

            if (userChoice == computerChoice) {
                System.out.println("It is a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

    /**This method is the menu for the options to choose from.*/
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            System.out.print("Do you want to play? (yes/no): ");
            playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("yes")) {
                System.out.print("Which game do you want to play? Enter 1 for Guessing Game, or 2 for Rock-Paper-Scissors. ");
                int gameNumber = scanner.nextInt();
                if(gameNumber == 1) {
                    playGame1();
                }

                if(gameNumber == 2) {
                    playGame2();
                }
            }
        } while (playAgain.equals("yes"));
        scanner.close();
    }
}