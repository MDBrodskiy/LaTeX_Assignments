/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the ArrayTester class from 2018 FRQ #4
 **/


public class ArrayTester

{

    public static int[] getColumn(int[][] arr2D, int c) {

        int[] arr = new int[arr2D.length];

        for (int row = 0; row < arr2D.length; row++) {

            arr[row] = arr2D[row][c];

        }

        return arr;

    }

    public static boolean isLatin(int[][] square) {

        if (containsDuplicates(square[0])) return false;

        for (int i = 0; i < square.length; i++) {

            if (!(hasAllValues(square[0], square[i]))) return false;
            if (!(hasAllValues(square[0], getColumn(square, i)))) return false;

        }

        return true;

    }

}
