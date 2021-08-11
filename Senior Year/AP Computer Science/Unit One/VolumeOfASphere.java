/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program calculates the volume of a sphere from a user-inputted radius
 * */

import java.util.*;

public class VolumeOfASphere

{

    public static void main(String[] args)
    
    {

        //Create a scanner object "keyboard" for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Explain the program to the user and request input
        System.out.println("Welcome to the sphere volume calculator");
        System.out.print("What is the radius of the sphere? ");

        //Create double variable to store input
        double rad = keyboard.nextDouble();

        //Print out the volume
        System.out.println("The volume is: " + ((4 * Math.PI * rad * rad * rad) / 3));

    }

}
