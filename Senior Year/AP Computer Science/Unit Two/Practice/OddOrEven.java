/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in a number and states whether it is odd or even
 **/

import java.util.*;

public class OddOrEven

{

    public static void main(String[] args)
    
    {


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = keyboard.nextInt();

        if (number == 0) {

            System.out.println(number + " is zero");
            System.exit(0);

        }

        else if (number % 2 == 0) {

            System.out.println(number + " is even");
            System.exit(0);

        }

        System.out.println(number + " is odd");

    }

}
