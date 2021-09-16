/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program asks the user to guess a random number from one to ten and gives three chances
 **/

import java.util.*;

public class GuessingGameRevised

{

    public static void main(String[] args)
    
    {
        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Request input from the user
        System.out.println("Welcome to the great guessing game!");
        System.out.print("Please guess a number from one to ten: ");
        int userChoice = keyboard.nextInt();

        //Create randomly generated number
        int computerChoice = (int)(10 * Math.random() + 1);

        //Create counter variable
        int timesGuessed = 1;

        //Create loop for three changes
        while (userChoice != computerChoice && timesGuessed < 3) {

            System.out.print("Incorrect. " + (3 - timesGuessed) + " guesses remaining: ");
            userChoice = keyboard.nextInt();
            timesGuessed += 1;
        
        }

        if (userChoice == computerChoice) {

            System.out.println("Good job! You guessed it in " + timesGuessed + " tries");

        }

        else {

            System.out.println("Wrong. You Failed.");

        }

    }

}
