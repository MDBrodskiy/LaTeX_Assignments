/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used to place prime number values into an IntegerArray object
 **/

public class PrimeNumbers

{

    public static void main(String[] args)
    
    {

        System.out.println(firstNPrimes(10));

    }

    public static IntegerArray firstNPrimes(int n) {

        IntegerArray arr = new IntegerArray();

        int i = 0;
        int counter = 0;

        while (counter < n) {

            if (isPrime(i)) {

                arr.append(i);
                counter++;

            }

            i++;

        }

        return arr;

    }

    public static boolean isPrime(int value) {

        if (value == 0 || value == 1) return false;

        for (int i = 2; i < ((value / 2) + 1); i++) {

            if (value % i == 0) return false;

        }

        return true;

    }

}
