/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in an age and states whether someone of that age can drive
 **/

import java.util.*;

public class CanDrive

{

    public static void main(String[] args)
    
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = keyboard.nextInt();

        if (age >= 16) {
            
            System.out.println("You can drive.");
            System.exit(0);

        }

        System.out.println("You can not drive. You will be able to drive in " + (16 - age) + " years");

    }

}
