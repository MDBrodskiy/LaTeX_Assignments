/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the ArrayResizer class from 2021 FRQ #4
 **/

public class ArrayResizer

{

    public static boolean isNonZeroRow(int[][] array2D, int r) {

        for (int i = 0; i < array2D[r]; i++) {

            if (array2D[r][i] == 0) return false;

        }

        return true;

    }

    public static int[][] resize(int[][] array2D) {

        int[][] smaller = new int[numNonZeroRows(array2D)][array2D[0].length];
        int count = 0;

        for (int i = 0; i < array2D.length; i++) {

            if (isNonZeroRow(array2D, i)) {

                for (int j = 0; j < array2D[0].length; j++) {

                    smaller[count][j] = array2D[i][j];

                }

                count++;

            }

        }

        return smaller;

    }

}
