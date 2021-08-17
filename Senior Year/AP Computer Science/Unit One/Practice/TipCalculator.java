/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program asks for the tip amount and calculates the value, the suggests how much each guest should pay
 **/

import java.util.*;

public class TipCalculator  {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How much was your meal? ");
        double mealPrice = keyboard.nextDouble();
        System.out.print("How much do you want to tip? ");
        double tipAmount = keyboard.nextDouble() / 100;
        System.out.printf("Your total is: $%.2f\n", (mealPrice * (1 + tipAmount)));
        System.out.print("How many people are in your party? ");
        int people = keyboard.nextInt();
        System.out.println("Each person should pay $" + ((mealPrice * (1 + tipAmount)) / people));

    }
}
