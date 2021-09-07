/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in a number and returns true if it's even and false if not
 **/

import java.util.*;

public class evenTester

{

    public static void main(String[] args)
    
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = keyboard.nextInt();
        System.out.println(isEven(number));

    }

    public static boolean isEven(int num) {
        
        if (num == 0) {

            return false;

        }

        return (num % 2 == 0) ? (true) : (false);

    }

}
