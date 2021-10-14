/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class describes a dataset
 **/

import java.util.*;

public class DataSet

{

    private int numberCount = 0;
    private int max = 0;

    private int currentVal;
    private double average;

    public DataSet() {

        currentVal = 0;
        average = 0;

    }

    public void add(int num) {

        numberCount++;
        int swp = currentVal;
        currentVal = num;

        if (currentVal > swp) {

            max = currentVal;

        }

        if (numberCount == 1) {

            average = (double) currentVal;

        }

        else if (numberCount >= 2) {

            average = ((average) * (numberCount - 1) + currentVal) / (double) numberCount;

        }

    }

    public double average() {

        return average;

    }

    public int max() {

        return max;

    }

}
