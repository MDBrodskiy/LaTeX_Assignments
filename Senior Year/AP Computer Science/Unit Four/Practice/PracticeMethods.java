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

        System.out.println(charCounter("hello world", "o"));
        System.out.println(charCounter("hello world", "z"));

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

    public static int charCounter(String phrase, String character) {

        int counter = 0;

        for (int i = 0; i < phrase.length(); i++) {

            if (phrase.substring(i, i + 1).equals(character)) counter += 1;

        }

        return counter;

    }

}
