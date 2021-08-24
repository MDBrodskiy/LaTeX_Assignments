/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in a number and states whether it is positive, negative or zero
 **/

import java.util.*;

public class PositiveNegativeZero

{

    public static void main(String[] args)
    
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = keyboard.nextInt();

        if (number < 0) {
            
            System.out.println("This number is negative");
            System.exit(0);

        }

        else if (number > 0) {

            System.out.println("This number is positive");
            System.exit(0);

        }

        System.out.println("The number is zero");

    }

}
