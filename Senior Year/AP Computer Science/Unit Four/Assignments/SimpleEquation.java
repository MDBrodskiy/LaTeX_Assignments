/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class is used to model a simple, linear equation
 **/

import java.util.*;

public class SimpleEquation

{

    private int a, b;

    public SimpleEquation() {

        this.a = 1;
        this.b = 0;

    }

    public SimpleEquation(int aValue, int bValue) {

        if (aValue != 0) {

            this.a = aValue;

        }

        else {

            this.a = 1;

        }

        this.b = bValue;

    }

    public int getAValue() {

        return this.a;

    }

    public int getBValue() {

        return this.b;

    }

    public void setAValue(int aValue) {

        if (aValue != 0) {

            this.a = aValue;

        }

        else {

            this.a = 1;

        }


    }

    public void setBValue(int bValue) {

        this.b = bValue;

    }

    public String toString() {

        return "y = " + a + "x + " + b;

    }

    public int getY(int x) {

        return (a * x + b);

    }

}
