/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the MaxRange class 
 **/


public class MaxRange

{

    private int[][] arr;

    public MaxRange() {

        arr = new int[0][0];

    }

    public MaxRange(int[][] arr2) {

        arr = new int[arr2.length][arr2[0].length];

        for (int row = 0; row < arr2.length; row++) {

            for (int col = 0; col < arr2[0].length; col++) {

                arr[row][col] = arr2[row][col];

            }

        }

    }

    public int max(int[] arr2) {

        int max = arr2[0];

        for (int i = 1; i < arr2.length; i++) {

            if (max < arr2[i]) max = arr2[i];

        }

        return max;

    }

    public int min(int[] arr2) {

        int min = arr2[0];

        for (int i = 1; i < arr2.length; i++) {

            if (min > arr2[i]) min = arr2[i];

        }

        return min;

    }

    public int maxRange() {

        int range = max(arr[0]) - min(arr[0]);

        for (int row = 0; row < arr[0].length; row++) {

            if (range < (max(arr[row]) - min(arr[row]))) range = (max(arr[row]) - min(arr[row]));

        }

        return range;

    }

}
