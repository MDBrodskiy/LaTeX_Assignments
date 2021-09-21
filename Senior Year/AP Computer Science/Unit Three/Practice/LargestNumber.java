/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program asks the user for values and prints the largest and smallest
 **/

import java.util.*;

public class LargestNumber

{

    public static void main(String[] args)
    
    {
        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number (-1 to quit): ");
        int newNumber = keyboard.nextInt();
        System.out.print("\n");
        int large = newNumber;
        int small = newNumber;

        while (newNumber != -1) {

            System.out.print("Enter a number (-1 to quit): ");
            int oldNumber = newNumber;
            newNumber = keyboard.nextInt();

            if (newNumber < small) {

                small = newNumber;

            }

            if (newNumber > large) {

                large = newNumber;

            }

            System.out.println("The smallest so far: " + small);
            System.out.println("The largest so far: " + large + "\n");

        }

    }

}
