/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Digits class from 2017 FRQ #1 
 **/


public class Digits

{

    private ArrayList<Integer> digitList;

    public Digits(int num) {

        digitList = new ArrayList<Integer>();

        String numAsString = num.toString();

        for (int i = 0; i < numAsString.length(); i++) {

            digitList.add(Integer.parseInt(numAsString.substring(i, i+1)));

        }

    }

    public boolean isStrictlyIncreasing() {

        for (int i = 0; i < digitList.size() - 1; i++) {

            if (digitList.get(i) >= digitList.get(i + 1)) return false;

        }

        return true;

    }

}
