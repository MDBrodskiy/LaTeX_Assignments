/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Bus class 
 **/

public class Bus

{

    private int stops, currentStop;
    private boolean forward;

    public Bus(int n) {

        stops = n;
        currentStop = 1;
        forward = false;

    }

    public int getCurrentStop() {

        return currentStop;

    }

    public void move() {

        if (currentStop == stops || currentStop == 1) forward = !forward; 

        if (forward) currentStop++;
        else if (!forward) currentStop--;

    }

}
