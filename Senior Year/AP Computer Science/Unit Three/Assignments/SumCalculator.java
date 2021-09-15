/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program asks the user for values and sums those values until 0 is entered
 **/

import java.util.*;

public class SumCalculator

{

    public static void main(String[] args)
    
    {
        //Introduce user and start calculator
        System.out.println("Welcome to the Average/Sum Calculator!");
        calculate();

    }

    public static void calculate() {

        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Create necessary variables
        int termsEntered = -1, numberEntered = -1, sum = 0;

        while (numberEntered != 0) {

            System.out.print("Enter a number (0 to exit): ");
            numberEntered = keyboard.nextInt();

            sum += numberEntered;
            termsEntered++;

        }

        System.out.println("\nThe sum is " + sum);
        System.out.println("The average is " + ( (double) sum / termsEntered));

    }

}
