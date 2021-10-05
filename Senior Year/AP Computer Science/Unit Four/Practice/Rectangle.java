/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the rectangle class
 **/

import java.util.*;

public class Rectangle

{

    private int width, height;

    public Rectangle() {

        this.width = 0;
        this.height = 0;

    }

    public Rectangle(int w, int h) {

        if (w < 0) {

            this.width = 0;

        }

        else {

            this.width = w;

        }

        if (h < 0) {

            this.height = 0;

        }
        
        else {

            this.height = h;

        }

    }

    public void setWidth(int w) {

        if (w < 0) {

            this.width = 0;

        }

        else {

            this.width = w;

        }

    }

    public void setHeight(int h) {

        if (h < 0) {

            this.height = 0;

        }

        else { 
            
            this.height = h;

        }

    }

    public int getWidth() {

        return this.width;

    }

    public int getHeight() {

        return this.height;

    }

    public String toString() {

        return "Width: " + this.width + ", Height: " + this.height;

    }

    public boolean equals(Rectangle other) {

        Rectangle r = (Rectangle) other;

        if (this.width == r.width && this.height == r.height) {

            return true;

        }

        return false;

    }

    public boolean isSquare() {

        return (this.height == this.width);

    }

}
