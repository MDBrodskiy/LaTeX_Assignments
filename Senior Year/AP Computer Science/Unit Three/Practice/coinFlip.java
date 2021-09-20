/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program simulates a coin flip a certain amount of times and returns the amount of times it was heads
 **/

import java.util.*;

public class coinFlip

{

    public static void main(String[] args)
    
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many times should the coin be flipped: ");
        System.out.println(coinFlipSimulation(keyboard.nextInt()));


    }

    public static double coinFlipSimulation(int flips) {

        int timesHeads = 0;
        int counter = 0;

        while (counter < flips) {

            double rand = (Math.random());

            timesHeads = (rand >= .5) ? (timesHeads + 1) : (timesHeads);

            counter++;

        }

        return (double) timesHeads / counter;

    }

}
