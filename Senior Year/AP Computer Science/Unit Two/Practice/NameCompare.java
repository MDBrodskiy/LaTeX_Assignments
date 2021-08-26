/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in a name and compares it to mine
 **/

import java.util.*;

public class NameCompare

{

    public static void main(String[] args)
    
    {


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        if (name.compareToIgnoreCase("michael") == 0) {

            System.out.println("We have the same name");
            System.exit(0);

        }

        else if (name.trim().length() == "michael".length()) {

            System.out.println("Both of our names contain " + name.length() + " letters");
            System.exit(0);

        }

        if (name.compareToIgnoreCase("michael") > 0) {

            System.out.println("Michael comes before " + name + " alphabetically");
            System.exit(0);

        }

        System.out.println(name + " comes before Michael alphabetically");

    }

}
