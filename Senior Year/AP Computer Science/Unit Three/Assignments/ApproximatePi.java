/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program uses a series to estimate pi
 **/

import java.util.*;

public class ApproximatePi

{

    public static void main(String[] args)
    
    {

        //Print test values
        System.out.println("Approximation at 1: " + approximatePi(1));
        System.out.println("Approximation at 10: " + approximatePi(10));
        System.out.println("Approximation at 100: " + approximatePi(100));
        System.out.println("Approximation at 1000: " + approximatePi(1000));
        System.out.println("Approximation at 10000: " + approximatePi(10000));
        System.out.println("Approximation at 100000: " + approximatePi(100000));
        System.out.println("Approximation at 1000000: " + approximatePi(1000000));

    }

    /**
     * The approximatePi method uses a series to estimate the value of pi
     * @param n The amount of terms of the sequence to use
     * @return The estimated value of pi
     */

    public static double approximatePi(int n) {

        double aggregate = 1;

        for (int i = 1; i < n; i++) {

            aggregate += ((Math.pow(-1,i)) / (2 * i + 1));

        }

        aggregate *= 4;

        return aggregate;

    }

}
