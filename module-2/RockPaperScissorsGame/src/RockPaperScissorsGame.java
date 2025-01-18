/* Alisa Steensen
* 01/16/25
* Module 2.2 


// This program is a simple rock, paper, scissors game. The user will be prompted to enter their choice and the computer will randomly generate a choice. The program will then determine the winner based on the choices.
*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        // identifying the choices
        final byte ROCK = 1;
        final byte PAPER = 2;
        final byte SCISSORS = 3;

        // Welcome message
        System.out.println("Welcome! Rock, Paper, Scissors, Shoot!");
        System.out.println("Please enter your choice: ");

        //User input
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        
         // Error incase of invalid input
         if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input! Please enter 1 for Rock, 2 for Paper, or 3 for Scissors.");
            return; // Exit the program
        }

        // Displaying the user's choice
        String userMove = getChoice(userChoice);
        System.out.println("You chose: " + userMove);
    
        // Displaying the computer's choice
        Random random = new Random();
        int computer_choice = random.nextInt(3) + 1; // Random number between 1 and 3
        String computerMove = getChoice(computer_choice);
        System.out.println("Computer chose: " + computerMove);

        // Determining the winner

        if (userChoice == computer_choice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == ROCK && computer_choice == SCISSORS) ||
                   (userChoice == PAPER && computer_choice == ROCK) ||
                   (userChoice == SCISSORS && computer_choice == PAPER)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }

    // Method to get the choice 
    public static String getChoice(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid choice";
        };
    }
}



