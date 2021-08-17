/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program calculates the diameter, circumference, and area of a circle
 **/

import java.util.*;

public class Circle

{

    public static void main(String[] args)
    
    {

        //Create a scanner object "keyboard" for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Explain the program to the user and request input
        System.out.println("Welcome to the Great Circle Calculator!");
        System.out.print("Radius: ");
        double rad = keyboard.nextDouble();
        System.out.printf("The diameter is %.2f\nThe circumference is %.2f\nThe area is %.2f", (2 * rad), (2 * Math.PI * rad), (Math.PI * rad * rad));

    }

}
