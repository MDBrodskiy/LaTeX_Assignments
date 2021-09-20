/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains algorithm practice
 **/

import java.util.*;

public class Algorithms

{

    public static void main(String[] args)
    
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = keyboard.nextInt();
        System.out.println("This number has " + countDigits(input) + " digits");
        System.out.println("The sum of these digits is " + sumDigits(input));

    }

    public static int sumDigits(int n) {

        String num = Integer.toString(n);
        int counter = 0;
        int sum = 0;

        while (counter < num.length()) {

            sum += Integer.parseInt(num.substring(counter,(counter + 1)));
            counter++;

        }

        return sum;

    }

    public static int countDigits(int n) {

        return Integer.toString(n).length();

    }

}
