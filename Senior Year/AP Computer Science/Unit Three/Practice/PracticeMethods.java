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

        System.out.println(factorial(5));

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

    public static int sumToN(int n) {

        int counter = 0;
        int sum = 0;

        while (counter <= n) {

            sum += counter;
            counter++;

        }

        return sum;

    }

    public static double averageToN(int n) {

        return (sumToN(n) /(double) n);

    }

    public static int sumMultiplesToN(int n) {

        int counter = 0;
        int sum = 0;

        while (counter <= n) {

            if (counter % 3 == 0 || counter % 5 ==0) {

                sum += counter;

            }

            counter++;

        }

        return sum;

    }

    public static String factor(int num) {

        int counter = 1;
        String factors = "";

        while (counter <= num) {

            if (num % counter == 0) {

                factors = factors + Integer.toString(counter) + " ";

            }
            
            counter++;

        }

        return factors;

    }

    public static void theFinalCountdown(int num) {

        for (int i = num; i >= 1; i--) {

            System.out.println(i);

            if (i == 1) {

                System.out.println("It's the FINAL COUNTDOWN!");

            }

        }

    }

    public static int sumMultiplesToN(int a, int b, int n) {

         int sum = 0;

         for (int i = 0; i <= n; i++) {

             sum += (i % a == 0 || i % b == 0) ? (i) : (0);

         }

         return sum;

    }

    public static double factorial(int num) {

        for (int i = num; i > 1; i--) {

            num *= i - 1;

        }

        return (double)num;

    }

}
