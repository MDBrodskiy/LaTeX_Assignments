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

        System.out.println(reverseString("TESTING THIS"));

    }

    public static void countUp() {

        int num = 0;

        while (num <= 9) {

            System.out.println(num);
            num++;

        }

    }

    public static void countDown() {

        int num = 9;

        while (num >= 0) {

            System.out.println(num);
            num--;

        }

        System.out.println("The Final Countdown");

    }

    public static void countUp(int upperLimit) {

        int lowerLimit = 0;

        while (lowerLimit <= upperLimit) {

            System.out.println(lowerLimit);
            lowerLimit++;

        }

    }

    public static void countUp(int lowerLimit, int upperLimit) {

        while (lowerLimit <= upperLimit) {

            System.out.println(lowerLimit);
            lowerLimit++;

        }

    }

    public static int sumToN(int n) {

        int counter = 0;
        int sum = 0;

        while (counter <= n) {

            sum += counter;
            counter++;

        }

        return sum;

    }

    public static double averageToN(int n) {

        return (sumToN(n) /(double) n);

    }

    public static int sumMultiplesToN(int n) {

        int counter = 0;
        int sum = 0;

        while (counter <= n) {

            if (counter % 3 == 0 || counter % 5 ==0) {

                sum += counter;

            }

            counter++;

        }

        return sum;

    }

    public static String factor(int num) {

        int counter = 1;
        String factors = "";

        while (counter <= num) {

            if (num % counter == 0) {

                factors = factors + Integer.toString(counter) + " ";

            }
            
            counter++;

        }

        return factors;

    }

    public static void theFinalCountdown(int num) {

        for (int i = num; i >= 1; i--) {

            System.out.println(i);

            if (i == 1) {

                System.out.println("It's the FINAL COUNTDOWN!");

            }

        }

    }

    public static int sumMultiplesToN(int a, int b, int n) {

         int sum = 0;

         for (int i = 0; i <= n; i++) {

             sum += (i % a == 0 || i % b == 0) ? (i) : (0);

         }

         return sum;

    }

    public static int sumEvenDigits(int num) {

        String number = Integer.toString(num);

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {

            sum += (Integer.parseInt(number.substring(i,i + 1)) % 2 == 0) ? Integer.parseInt(number.substring(i, i + 1)) : 0;

        }

        return sum;

    }

    public static double factorial(double num) {

        if (num <= 1) {

            return num;

        }

        return factorial(num - 1) * num;

    }

    public static boolean isVowel(String str) {

        if (str.equalsIgnoreCase("a") || str.equalsIgnoreCase("e") || str.equalsIgnoreCase("i") || str.equalsIgnoreCase("o") || str.equalsIgnoreCase("u")) {

            return true;

        }
        
        return false;

    }

    public static int vowelCount(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (isVowel(str.substring(i, i + 1))) {

                count++;

            }

        }

        return count;

    }

    public static int charCount(String s, String c) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.substring(i, i + 1).equalsIgnoreCase(c)) {

                count++;

            }

        }

        return count;

    }

    public static String response(String attendance, String choice) {

        if (attendance.equals("yes")) {

            if(choice.equals("veg")) {

                return "Thanks for attending. Your meal choice is vegetarian.";

            }

            else {

                return "Thanks for attending. Your meal choice is " + choice + ".";

            }

        }

        return "Sorry that you cannot attend the wedding.";

    }

    public static int sumOddDigits(int num) {

        int sum = 0;

        for (int i = num; i > 0; i /= 10) {

            if ((i % 10) % 2 != 0) {

                sum += (i % 10);

            }

        }

        return sum;

    }

    public static boolean isPrime(int num) {

        int i = 2;

        do {

            if (num == 1) {

                return false;

            }

            if (num % i == 0) {

                return false;

            }

            i++;

        } while (i < ((num / 2) + 1));

        return true;

    }

    public static String primesToLimit(int num) {

        String primes = "";

        if (num <= 0) {

            return "INVALID";

        }

        for (int i = 1; i <= num; i++) {

            if (isPrime(i)) {

                primes += i + " ";

            }

        }

        return primes;

    }

    public static String reverseString(String s) {

        String reversed = "";

        for (int i = s.length(); i > 0; i--) {

            reversed += s.substring(i - 1, i);

        }

        return reversed;

    }

}
