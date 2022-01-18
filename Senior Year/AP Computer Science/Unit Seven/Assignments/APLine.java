/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the APLine class
 **/


public class APLine

{

    private int a, b, c;

    public APLine(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getSlope() {

        return -1.0 * a / b;

    }

    public boolean isOnLine(int x, int y) {

        return  (a * x + b * y + c == 0);

    }

}
