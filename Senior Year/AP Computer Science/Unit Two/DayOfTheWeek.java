/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes a numerical value and prints out the corresponding day of the week
 **/

import java.util.*;

public class DayOfTheWeek

{

    public static void main(String[] args)
    
    {

        //Create an array to print out a corresponding name
        String[] dayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //Create a scanner object "keyboard" for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Explain the program to the user and request input
        System.out.println("Hello and welcome to the amazing day of the week calculator.");
        System.out.print("Please enter the day of the week: ");
        int DayOfTheWeek = keyboard.nextInt();

        //If the number is out of bounds, print an error. Otherwise, print the day name
        if (DayOfTheWeek > 6 || DayOfTheWeek < 0) {

            System.out.println("Invalid Choice!");

        }

        else {

            System.out.println(dayName[DayOfTheWeek]);

        }

    }

}
