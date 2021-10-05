/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains many practice methods
 **/

import java.util.*;

public class PracticeMethods

{

    public static void main(String[] args)
    
    {
        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.println(facString(5));

    }

    public static String facString(int limit) {

        if (limit < 0) {

            return "INVALID";

        }

        if (limit == 0) {

            return "1";

        }

        String facts = "";

        int product = 1;

        for (int i = 1; i <= limit; i++) {

            product *= i;

            facts += product + " ";

        }

        return facts;

    }

}
