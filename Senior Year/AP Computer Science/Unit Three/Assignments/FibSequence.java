/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used to print the Fibonacci sequence
 **/

import java.util.*;

public class FibSequence

{

    public static void main(String[] args)
    
    {

        //Print test value
        System.out.print(fibSequence(20));

    }

    public static String fibSequence(int num) {

        String sequence = "0 1";

        int prevTerm = 0;
        int currentTerm = 1;
        int nextTerm = 1;

        if (num == 1) {

            return "0";

        }

        else if (num == 2) {

            return sequence;

        }

        for (int i = 2; i < num; i++) {

            sequence += " " + Integer.toString(nextTerm);

            prevTerm = currentTerm;
            currentTerm = nextTerm;
            nextTerm = (currentTerm + prevTerm);


        }

        return sequence;

    }

}
