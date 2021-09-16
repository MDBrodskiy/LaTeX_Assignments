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

        countUp();
        countDown();
        countUp(9);
        countUp(0,9);

    }

    public static void countUp() {

        int num = 0;

        while (num <= 9) {

            System.out.println(num);
            num++;

        }

    }

    public static void countDown() {

        int num = 9;

        while (num >= 0) {

            System.out.println(num);
            num--;

        }

        System.out.println("The Final Countdown");

    }

    public static void countUp(int upperLimit) {

        int lowerLimit = 0;

        while (lowerLimit <= upperLimit) {

            System.out.println(lowerLimit);
            lowerLimit++;

        }

    }

    public static void countUp(int lowerLimit, int upperLimit) {

        while (lowerLimit <= upperLimit) {

            System.out.println(lowerLimit);
            lowerLimit++;

        }

    }

}
