/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program generates two random numbers and uses them to make a math quiz
 **/

import java.util.*;

public class MathQuizGame

{

    public static void main(String[] args)
    
    {

        //Create variables to be used later
        final int firstNumber = (int)(100 * Math.random()), secondNumber = (int)(100 * Math.random());
        int pointsCorrect = 0;

        //Create a scanner object "keyboard" for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Ask the math questions
        System.out.print("What is " + firstNumber + " + " + secondNumber + ": ");
        int numberGuessed = keyboard.nextInt();

        if (numberGuessed == (firstNumber + secondNumber)) {

            pointsCorrect += 1;
            System.out.println("Good Job. That's Correct.");

        }

        else {

            System.out.println("Sorry, that's wrong. It's " + (firstNumber + secondNumber));

        }

        System.out.print("What is " + firstNumber + " - " + secondNumber + ": ");
        numberGuessed = keyboard.nextInt();

        if (numberGuessed == (firstNumber - secondNumber)) {

            pointsCorrect += 1;
            System.out.println("Good Job. That's Correct.");

        }

        else {

            System.out.println("Sorry, that's wrong. It's " + (firstNumber - secondNumber));

        }

        System.out.print("What is " + firstNumber + " * " + secondNumber + ": ");
        numberGuessed = keyboard.nextInt();

        if (numberGuessed == (firstNumber * secondNumber)) {

            pointsCorrect += 1;
            System.out.println("Good Job. That's Correct.");

        }

        else {

            System.out.println("Sorry, that's wrong. It's " + (firstNumber * secondNumber));

        }

        if (pointsCorrect == 3) {

            System.out.println("You got " + pointsCorrect + "/3. Good job.");

        }

        else if (pointsCorrect == 2) {

            System.out.println("You got " + pointsCorrect + "/3. That's decent.");

        }

        else if (pointsCorrect == 1) {

            System.out.println("You got " + pointsCorrect + "/3. That's pretty bad.");

        }

        else {

            System.out.println("You got " + pointsCorrect + "/3. You failed the quiz.");

        }

    }

}
