/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in a name and states whether my name is the same
 **/

import java.util.*;

public class SameName

{

    public static void main(String[] args)
    
    {


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        if (name.toLowerCase().equals("michael")) {

            System.out.println("We have the same name");
            System.exit(0);

        }

        System.out.println("We do not have the same name");

    }

}
