/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program takes in three numbers and states whether any are equal
 **/

import java.util.*;

public class ThreeOfAKind

{

    public static void main(String[] args)
    
    {


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int firstNumber = keyboard.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = keyboard.nextInt();
        System.out.print("Please enter the third number: ");
        int thirdNumber = keyboard.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {

            System.out.println("There are three of a kind!");

        }

        else if (firstNumber == secondNumber || secondNumber == thirdNumber || firstNumber == thirdNumber) {

            System.out.println("There are two of a kind!");

        }

        else {

            System.out.println("The numbers are all different.");

        }

    }

}
