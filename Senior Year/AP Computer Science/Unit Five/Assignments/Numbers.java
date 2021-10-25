/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class is used to work with numbers
 **/

public class Numbers

{

    private int[] a;

    public Numbers(int[] arr) {

        a = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            a[i] = arr[i];

        }

    }

    public int sum() {

        int sum = 0;

        for (int i : a) {

            sum += i;

        }

        return sum;

    }

    public int max() {

        int max = a[0];

        for (int i : a) {

            max = (i > max) ? i : max;

        }

        return max;

    }

    public int min() {

        int min = a[0];

        for (int i : a) {

            min = (i < min) ? i : min;

        }

        return min;

    }

    public double average() {

        double sum = 0;

        for (int i : a) {

            sum += i;

        }

        return (sum / a.length);

    }

    public boolean isIncreasing() {

        for (int i = 1; i < a.length; i++) {

            if (a[i - 1] > a[i]) {

                return false;

            }

        }

        return true;

    }

}
