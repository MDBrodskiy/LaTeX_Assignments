/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program calculates the area and diagonal length of a rectangle
 **/

import java.util.*;

public class Rectangle

{

    public static void main(String[] args)
    
    {

        //Create a scanner object "keyboard" for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Explain the program to the user and request input
        System.out.println("Welcome to the Great Rectangle Calculator!");
        System.out.print("Length: ");
        double len = keyboard.nextDouble();
        System.out.print("Width: ");
        double wid = keyboard.nextDouble();
        System.out.printf("The area is %.2f\nThe diagonal is %.2f", (len * wid), (Math.sqrt((len * len) + (wid * wid))));

    }

}
