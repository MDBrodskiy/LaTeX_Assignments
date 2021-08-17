/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program converts minutes to hours and minutes
 **/

import java.util.*;

public class ConvertMinutes

{

    public static void main(String[] args)
    
    {

        //Create a scanner object "keyboard" for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Explain the program to the user and request input
        System.out.println("Welcome to the Minutes Conversion Calculator.");
        System.out.print("Could you please enter the number of minutes to convert? ");
        int minutes = keyboard.nextInt();
        System.out.println(minutes + " minute(s) is " + (minutes / 60) + " hour(s) and " + (minutes % 60) + " minute(s).");

    }

}
