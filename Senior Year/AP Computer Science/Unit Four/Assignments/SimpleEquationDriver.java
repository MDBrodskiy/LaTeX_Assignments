/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used as a driver for the SimpleEquation class
 **/

import java.util.*;

public class SimpleEquationDriver

{

    public static void main(String[] args) {

        SimpleEquation se = new SimpleEquation(); 
        SimpleEquation se2 = new SimpleEquation(-3, -7);
        System.out.println(se2);
        se.setAValue(0);
        System.out.println(se);
        se.setAValue(2);
        se.setBValue(5);
        System.out.println(se);
        System.out.println(se.getAValue());
        System.out.println(se.getY(4));

    }

}
