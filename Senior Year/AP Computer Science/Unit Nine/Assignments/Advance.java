/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Advance class from 2005 FRQ #2
 **/

public class Advance extends Ticket

{

    private int daysEarly;

    public Advance(int advance) {

        daysEarly = advance;

    }

    @Override
    public double getPrice() {

        if (daysEarly > 9) return 30.0;
        return 40.0;

    }

}
