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

        int[] a = {5,4,1,2,3};
        System.out.println(maxValue(a));

    }

    public static int indexOfMin(int[] arr) {

        //Practice 6.1

        int minVal = Integer.MAX_VALUE;

        for (int e : arr) {

            minVal = (e < minVal) ? e : minVal;

        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == minVal) return i;

        }

        return -1;

    }

    public static int maxValue(int[] arr) {

        //Practice 6.2

        int maxVal = Integer.MIN_VALUE;

        for (int e : arr) {

            maxVal = (maxVal < e) ? e : maxVal;

        }

        return maxVal;

    }

}
