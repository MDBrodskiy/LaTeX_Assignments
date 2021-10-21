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

        System.out.println(randomCount(100,2));

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

}
