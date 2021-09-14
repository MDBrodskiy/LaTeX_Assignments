/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program asks the user to guess an random number from one to ten
 **/

import java.util.*;

public class GuessingGame

{

    public static void main(String[] args)
    
    {
        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Request input from the user
        System.out.println("Welcome to the great guessing game!");
        System.out.print("Please guess a number from one to ten: ");
        int userChoice = keyboard.nextInt();
        int computerChoice = (int)(10 * Math.random() + 1);
        
        //Determine whether the number was guessed correctly
        if (userChoice == computerChoice) {

            System.out.println("You're awesome! You guessed it!");

        }

        else {

            System.out.println("You're not that good at guessing numbers. The right number is " + computerChoice);

        }

    }

}
