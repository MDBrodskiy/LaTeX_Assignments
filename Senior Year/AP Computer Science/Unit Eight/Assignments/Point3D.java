/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Point3D class
 **/


public class Point3D

{

    public static int pointCount = 0;
    private int x, y, z;

    public Point3D() {

        x = 0;
        y = 0;
        z = 0;
        pointCount++;

    }

    public Point3D(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
        pointCount++;

    }

    public int getX() {

        return this.x;

    }

    public int getY() {

        return this.y;

    }

    public int getZ() {

        return this.z;

    }

    public void setX(int x) {

        this.x = x;

    }

    public void setY(int y) {

        this.y = y;

    }

    public void setZ(int z) {

        this.z = z;

    }

    public double distance() {

        return Math.sqrt((this.x) * (this.x) + (this.y) * (this.y) + (this.z) * (this.z));

    }

    public double distance(int x2, int y2, int z2) {

        return Math.sqrt((this.x - x2) * (this.x - x2) + (this.y - y2) * (this.y - y2) + (this.z - z2) * (this.z - z2));

    }

    public String toString() {

        return "Point3D: (" + this.x + ", " + this.y + ", " + this.z + ")";

    }

    public boolean equals(Point3D p3d) {

        if (this.x == p3d.getX() && this.y == p3d.getY() && this.z == p3d.getZ()) return true;

        return false;

    }

}
