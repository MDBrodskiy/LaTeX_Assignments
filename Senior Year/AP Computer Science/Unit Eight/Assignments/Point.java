/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Point class
 **/

public class Point

{

    private static int pointObjects = 0;
    private int x, y;

    public Point() {

        pointObjects++;
        x = 0;
        y = 0;

    }

    public Point(int x2, int y2) {

        pointObjects++;
        x = x2;
        y = y2;

    }

    public int getX() {

        return x;

    }

    public double distance() {

        return Math.pow(x * x + y * y, .5);

    }

    public double distance(int x2, int y2) {

        return Math.pow((x - x2) * (x - x2) + (y - y2) * (y - y2), .5);

    }

    public int getTotalPointsCreated() {

        return pointObjects;

    }

    public int getY() {

        return y;

    }

    public String toString() {

        return "Point: (" + x + ", " + y + ")";

    }

    public boolean equals(Point p2) {

        if (this.x == p2.getX() && this.y == p2.getY()) return true;
        return false;

    }

}
