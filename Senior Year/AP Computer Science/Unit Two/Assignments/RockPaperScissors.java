/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program uses computerChoice and winner to play a game of Rock-Paper-Scissors
 **/

import java.util.*;

public class RockPaperScissors

{

    public static void main(String[] args)
    
    {
        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Request input from the user
        System.out.println("Welcome to Rock Paper Scissors.");
        System.out.print("Please pick rock, paper, or scissors: ");
        String userChoice = keyboard.nextLine().trim().toLowerCase();
        
        //Run computerChoice to get a random value
        String computerChoice = computerChoice();

        //Determine the winner
        winner(userChoice, computerChoice);

    }

    /**
     * The computerChoice method returns a random choice of either rock, paper, or scissors
     * @return Rock, paper, or scissors arbitrarily
     */

    public static String computerChoice() {

        int rand = (int)(3 * Math.random());

        if (rand < 1) {

            return "rock";

        }

        else if (rand < 2) {

            return "paper";

        }

        else {

            return "scissors";

        }

    }

    /**
     * The winner method takes in the user's choice and the computer's choice, and determines a winner
     * @param user The user's choice
     * @param computer The computer's choice
     */

    public static void winner(String user, String computer) {

        System.out.println(user + " vs. " + computer);

        if (user.equals(computer)) {

            System.out.println("You Tie.");

        }

        else if ((user.equals("rock") && computer.equals("scissors")) || (user.equals("scissors") && computer.equals("paper")) || (user.equals("paper") && computer.equals("rock"))) {

            System.out.println("You Win.");

        }

        else {

            System.out.println("You Lose.");

        }

    }

}
