/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program displays the differences between integer and floating point arithmetic
 * */

public class Operators

{

    public static void main(String[] args)
    
    {

        //Define final variables
        final int firstIntNumber = 3, secondIntNumber = 5;
        final double firstDoubleNumber = 3.5, secondDoubleNumber = 5.5;

        //Display int arithmetic
        System.out.println("Integer Arithmetic: ");
        System.out.println("--------------------------");
        System.out.println(secondIntNumber +  " + " + firstIntNumber +  " = " + (secondIntNumber + firstIntNumber));
        System.out.println(secondIntNumber +  " - " + firstIntNumber +  " = " + (secondIntNumber - firstIntNumber));
        System.out.println(secondIntNumber +  " * " + firstIntNumber +  " = " + (secondIntNumber * firstIntNumber));
        System.out.println(secondIntNumber +  " / " + firstIntNumber +  " = " + (secondIntNumber / firstIntNumber));
        System.out.println(secondIntNumber +  " % " + firstIntNumber +  " = " + (secondIntNumber % firstIntNumber) + "\n");

        //Display floating point arithmetic
        System.out.println("Floating Point Arithmetic: ");
        System.out.println("--------------------------");
        System.out.println(secondDoubleNumber +  " + " + firstDoubleNumber +  " = " + (secondDoubleNumber + firstDoubleNumber));
        System.out.println(secondDoubleNumber +  " - " + firstDoubleNumber +  " = " + (secondDoubleNumber - firstDoubleNumber));
        System.out.println(secondDoubleNumber +  " * " + firstDoubleNumber +  " = " + (secondDoubleNumber * firstDoubleNumber));
        System.out.println(secondDoubleNumber +  " / " + firstDoubleNumber +  " = " + (secondDoubleNumber / firstDoubleNumber));
        System.out.println(secondDoubleNumber +  " % " + firstDoubleNumber +  " = " + (secondDoubleNumber % firstDoubleNumber));

    }

}
