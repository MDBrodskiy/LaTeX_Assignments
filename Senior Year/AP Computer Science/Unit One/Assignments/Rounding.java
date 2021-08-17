/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program rounds an inputted value
 **/

import java.util.*;

public class Rounding

{

    public static void main(String[] args)
    
    {

        //Create a scanner object "keyboard" for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Explain the program and request input
        System.out.println("Welcome to the mighty rounding calculator!");
        System.out.print("What value would you like to be rounded? ");
        double round = keyboard.nextDouble();
        System.out.println(round + " rounded is " + (int)(round + .5));

    }

}
