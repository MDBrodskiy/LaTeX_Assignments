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

        System.out.println(isPrime(1));
        System.out.println(isPrime(10));
        System.out.println(isPrime(11));

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

    public static String replace(String str, String from, String to) {

        String tmp = "";

        while (str.indexOf(from) != -1) {

            for (int i = 0; i < str.length(); i++) {
                
                if (str.substring(i, i + from.length()).equals(from)) {

                    tmp += to;

                }

                else {

                    tmp += str.substring(i, i + 1);

                }

            }

            return tmp;

        }

        return str;

    }

    public static boolean isPrime(int num) {
         
        for (int i = 2; i <= ((num / 2) + 1); i++) {

            if ((num % i == 0) && num != 1) {

                return true;

            }

        }

        return false;

    }

}
