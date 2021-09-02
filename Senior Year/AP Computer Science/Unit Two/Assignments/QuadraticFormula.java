/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program executes quadratic formula operations
 **/

import java.util.*;

public class QuadraticFormula

{

    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {

        //Introduce the user
        System.out.println("Welcome to the Quadratic Equation Solver!");

        //Execute introduction to collect data
        introduction();

        //Execute the calculation method
        findSolutions(a, b, c);

    }

    public static void introduction() {

        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);


        //Request coefficients and verify this makes a quadratic equation
        System.out.print("Please specify the coefficient on x squared: ");
        a = keyboard.nextInt();

        if (a == 0) {

            System.out.println("\nSorry, that's not a quadratic equation.");
            System.exit(0);

        }

        System.out.print("Please specify the coefficient on x: ");
        b = keyboard.nextInt();
        System.out.print("Please specify the constant: ");
        c = keyboard.nextInt();

    }

    public static void findSolutions(int x, int y, int z) {

        if ((y * y) - (4 * x * z) < 0) {

            System.out.println("\nThere are no real solutions.");
            System.exit(0);

        }

        else if ((y * y) - (4 * x * z) == 0) {

            System.out.println("There is one solution: " + (-y/(2.0 * x)));
            System.exit(0);

        }

        else {

            System.out.println("There are two solutions: " + ( (-y - Math.sqrt((y * y) - (4 * x * z)))/(2.0 * x) ) + " and " + ( (-y + Math.sqrt((y * y) - (4 * x * z)))/(2.0 * x)) );
            System.exit(0);

        }

    }

}
