/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used to test the Ball class
 **/

import java.util.*;

public class BallDriver

{

    public static void main(String[] args) {

        System.out.println("Total Balls: " + Ball.instanceCount());

        Ball b = new Ball(new Point(1, 1), 2, 2);

        System.out.println(b);

        System.out.println("Total Balls: " + Ball.instanceCount());

    }

}
