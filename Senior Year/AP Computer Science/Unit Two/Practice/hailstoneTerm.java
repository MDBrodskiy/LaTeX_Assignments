/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in a number and returns the next hailstone term based on whether the number is even or not
 **/

import java.util.*;

public class hailstoneTerm

{

    public static void main(String[] args)
    
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = keyboard.nextInt();
        System.out.println(nextHailstoneTerm(number));

    }

    public static int nextHailstoneTerm(int num) {
        
        return (num % 2 == 0) ? (num / 2) : (3 * num + 1);

    }

}
