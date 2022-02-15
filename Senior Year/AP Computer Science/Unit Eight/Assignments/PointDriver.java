/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the driver for the Point class
 **/

public class PointDriver

{

    public static void main(String[] args) {

        Point p = new Point();
        System.out.println(p.getX());
        System.out.println(p.distance());
        System.out.println(p.getTotalPointsCreated());

        Point p2 = new Point(-5, 12);
        System.out.println(p2.getY());
        System.out.println(p2.distance(2,-1));
        System.out.println(p2);
        System.out.println(p2.equals(p));

        System.out.println(p.equals(new Point(0,0)));
        System.out.println(p2.getTotalPointsCreated());

    }

}
