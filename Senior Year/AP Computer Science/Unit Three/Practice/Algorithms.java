/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains algorithm practice
 **/

import java.util.*;

public class Algorithms

{

    public static void main(String[] args)
    
    {

        System.out.println(sumDigits(1505050));

    }

    public static int sumDigits(int n) {

        String num = Integer.toString(n);
        int counter = 0;
        int sum = 0;

        while (counter < num.length()) {

            sum += Integer.parseInt(num.substring(counter,(counter + 1)));
            counter++;

        }

        return sum;

    }

}
