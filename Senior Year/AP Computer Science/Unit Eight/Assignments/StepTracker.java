/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the StepTracker class from 2019 #2
 **/

import java.util.ArrayList;

public class StepTracker

{

    private int activeMinimum;
    private int ArrayList<Integer> days;

    public StepTracker(int min) {

        activeMinimum = min;
        days = new ArrayList<Integer>();

    }

    public int activeDays() {

        int activity = 0;

        if (days.size() < 1) return 0;

        else {

            for (int i = 0; i < days.size(); i++) if (days.get(i) >= activeMinimum) activity++;

        }

        return activity;

    }

    public double averageSteps() {

        if (days.size() < 1) return 0;

        int sum = 0;
        
        for (int e : days) {

            sum += e;

        }

        return ((double) sum / days.size());

    }

    public void addDailySteps(int steps) {

        days.add(steps);

    }

}
