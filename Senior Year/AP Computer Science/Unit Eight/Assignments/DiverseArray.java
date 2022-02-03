/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the DiverseArray class from 2015 FRQ #1
 **/


public class DiverseArray

{


    public static int arraySum(int[] arr) {

        int sum = 0;

        for (int e : arr) {

            sum += e;

        }

        return sum;

    }

    public static int[] rowSums(int[][] arr2D) {

        int count = 0;;
        int[] newArr = new int[arr2D.length];

        for (int[] e : arr2D) {

            newArr[count] = arraySum(e);
            count++;

        }

        return newArr;

    }

    public static boolean isDiverse(int[][] arr2D) {

        int[] allSums = new int[arr2D.length];

        allSums = rowSums(arr2D);

        for (int i = 0; i < allSums.length; i++) {

            for (int j = i + 1; j < allSums.length; j++) {

                if (allSums[i] == allSums[j]) return false;

            }

        }

        return true;

    }

}
