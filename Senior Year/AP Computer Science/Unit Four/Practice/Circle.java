/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class describes a circle
 **/

import java.util.*;

public class Circle

{

    private Point center;
    private double r;

    public Circle() {

        center = new Point();
        this.r = 1;

    }

    public Circle(int x, int y, double radius) {

        center = new Point(x, y);
        this.r = radius;

    }

    public Circle(Point other, double radius) {

        center = new Point(other);
        this.r = radius;

    }

    public double getArea() {

        return Math.PI * r * r;

    }

    public double getDiameter() {

        return 2 * r;

    }


    public String toString() {

        return "This circle is centered at (" + center.getX() + ", " + center.getY() + "), with a radius " + r;

    }

    public boolean equals(Point other, double radius) {

        if (center.equals(other) && this.r == radius) {

            return true;

        }

        return false;

    }

}
