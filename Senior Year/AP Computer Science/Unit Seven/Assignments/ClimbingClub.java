/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the ClimbingClub
 **/


public class ClimbingClub

{

    private ArrayList<ClimbInfo> climbList;

    /*
     * Version (a)
     */
    public void addClimb(String peakName, int climbTime) {

        climbList.add(new ClimbInfo(peakName, climbTime));

    }

    /*
     * Version (b)
     */

    public void addClimb(String peakName, int climbTime) {

        int counter = 0;

        while (climbList.get(counter).getName.compareToIgnoreCase(peakName) < 0) {

            counter++;

        }

        climbList.add(counter, new ClimbInfo(peakName, climbTime));

    }

    /*
     * i) The method does NOT work when the items are sorted in the order they were added
     *
     * ii) The method DOES work when the items are sorted in alphabetical order
     */

}
