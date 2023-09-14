package com.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Asus
 *
 */
/**
 * @author Asus
 *
 */
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            int numberOfTries = 0;
            int maxAttempts = 10;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've chosen a number between 1 and 100. Try to guess it!");

            while (numberOfTries < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfTries++;

                if (userGuess < randomNumber) {
                    System.out.println("Try a higher number.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Try a lower number.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
                    break;
                }
            }

            if (numberOfTries == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
