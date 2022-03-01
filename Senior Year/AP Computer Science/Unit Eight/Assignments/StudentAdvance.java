/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the StudentAdvance class from 2005 FRQ #2
 **/

public class StudentAdvance extends Advance

{

    private int daysEarly;

    public StudentAdvance(int advance) {

        super(advance);
        daysEarly = advance;

    }

    @Override
    public double getPrice() {

        return (super.getPrice() / 2);

    }

    @Override
    public String toString() {

        return super.toString() + "\n (Student ID Required)";

    }

}
