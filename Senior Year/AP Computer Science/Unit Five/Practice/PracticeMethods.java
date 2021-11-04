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

        int[] a = {1,2,3,5,5,5,5,6,4,4,4,4};

        rotateLeft(a);

        for (int x : a) System.out.print(x + " ");

    }

    public static void box(int l, int w) {

        if (l == w) {

            //Create Scanner for keyboard input
            Scanner keyboard = new Scanner(System.in);

            System.out.print("This is a square, still print? (y/n) ");
            String response = keyboard.nextLine();

            if (!response.substring(0,1).toUpperCase().equals("Y")) {

                System.out.println("Ok... Exiting...");
                System.exit(0);

            }

        }

        for (int i = 0; i < l; i++) {

            if (i == 0 || i == (l - 1)) {

                for (int j = 0; j < w; j++) {

                    System.out.print("*");

                }

                System.out.print("\n");

            }

            else {

                for (int j = 0; j < w; j++) {

                    if (j == 0 || j == (w - 1)) {

                        System.out.print("*");

                    }

                    else {

                        System.out.print(" ");

                    }

                }

                System.out.print("\n");

            }

        }

    }

    public static int randomCount(int max, int key) {

        int keyInstance = 0;
        int counter = 0;
        while (counter != max) {

            int rand = (int)(10 * Math.random());
            keyInstance += (rand == key) ? 1 : 0;
            counter++;

        }

        return keyInstance;

    }

    public static int sum(int[] arr) {

        int sum = 0;

        for (int i : arr) {

            sum += i;

        }

        return sum;

    }

    public static int max(int[] a) {

        int max = a[0];

        for (int i : a) {

            max = (i > max) ? i : max;

        }

        return max;

    }

    public static int min(int[] a) {

        int min = a[0];

        for (int i : a) {

            min = (i < min) ? i : min;

        }

        return min;

    }

    public static int[] reverse(int[] a) {

        int[] tmp = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {

            tmp[i] = a[a.length - i - 1];

        }

        return tmp;

    }

    public static int[] combine(int[] a, int[] b) {

        int[] tmp = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {

            tmp[i] = a[i];

        }

        for (int i = 0; i < b.length; i++) {

            tmp[i + a.length] = b[i];

        }

        return tmp;

    }

    public static int count(int[] arr, int key) {

        int count = 0;

        for (int x : arr) {

            if (x == key) count++;

        }

        return count;

    }

    public static int mode(int[] arr) {

        int num = arr[0];

        for (int x : arr) {

            if (count(arr, x) > count(arr, num)) num = x;

        }

        return num;

    }

    public static void rotateLeft(int[] arr) {

        int leftValue = arr[0];
        int[] otherValues = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {

            otherValues[i - 1] = arr[i];

        }

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1) arr[i] = otherValues[i];
            else arr[i] = leftValue;

        }

    }

}
