/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the CombinedTable class from 2021 FRQ #2
 **/

public class CombinedTable

{

    private int seats;
    private double viewQuality;

    public CombinedTable(SingleTable t1, SingleTable t2) {

        seats = t1.getNumSeats() + t2.getNumSeats() - 2;

        if (t1.getHeight() == t2.getHeight()) {

            viewQuality = ((t1.getViewQuality() + t2.getViewQuality()) / 2);

        }

        else {

            viewQuality = ((t1.getViewQuality() + t2.getViewQuality()) / 2) - 10.0;

        }

    }

    public boolean canSeat(int request) {

        if (seats >= request) return true;

        return false;

    }

    public double getDesirability() {

        return viewQuality;

    }

}
