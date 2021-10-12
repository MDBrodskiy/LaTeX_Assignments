/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class describes a ball
 **/

import java.util.*;


public class Ball

{

    public static int ballCount = 0;

    private Point center;
    private int xVel, yVel;

    public Ball() {

        center = new Point(0, 0);
        xVel = 0;
        yVel = 0;
        ballCount++;

    }

    public Ball(Point location, int speedX, int speedY) {

        this.xVel = speedX;
        this.yVel = speedY;
        this.center = new Point(location.getX(), location.getY());
        ballCount++;

    }

    public int getSpeedX() {

        return this.xVel;

    }

    public int getSpeedY() {

        return this.yVel;

    }

    public void setSpeedX(int vel) {

        this.xVel = vel;

    }

    public void setSpeedY(int vel) {

        this.yVel = vel;

    }

    public Point getCenter() {

        return center;

    }

    public static int instanceCount() {

        return ballCount;

    }

    public String toString() {

        return "Ball @ (" + center.getX() + ", " + center.getY() + "), xVel = " + this.xVel + ", yVel = " + this.yVel;

    }

    public void move() {

        center.setX(xVel + center.getX());
        center.setY(yVel + center.getY());

    }

}
