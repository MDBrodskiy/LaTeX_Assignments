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

        if (isEven(number)) {

            System.out.println(number + " is even");
            System.exit(0);

        }

        System.out.println(number + "is odd");

    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {

            return true;

        }

        return false;

    }

}
