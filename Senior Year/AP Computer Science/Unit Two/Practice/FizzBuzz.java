/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is an example of a FizzBuzz program using a fizzBuzz method
 **/

import java.util.*;

public class FizzBuzz

{

    public static void main(String[] args)
    
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int value = keyboard.nextInt();
        System.out.println(fizzBuzz(value));

    }

    /**
     * The fizzBuzz method is used to evaluate a number's divisibility by 3 and 5
     * @param num The number to be evaluated
     * @return "FizzBuzz" if the number is divisible by 3 and 5, "Fizz" if the number is divisble only by 3, "Buzz" if the number is divisible only by 5, and "None" if it is not divisible by 3 or 5
     */

    public static String fizzBuzz(int num) {

        if (num % 3 == 0 && num % 5 == 0) {

            return "FizzBuzz";

        }

        else if (num % 3 == 0) {

            return "Fizz";

        }

        else if (num % 5 == 0) {

            return "Buzz";

        }

        return "None";

    }

}
